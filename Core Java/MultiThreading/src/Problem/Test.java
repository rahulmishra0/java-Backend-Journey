package Problem;

class Counter{
    int count = 0;

    //Yaha par humne whole method ko Synchronized kar diya h that is not a good practice
//    synchronized void increment(){
//        count++;
//    }

    //Synchronized
    void increment(){
        System.out.println("Incrementing count......."); //yaha tak multithreading allow hogi but
        synchronized (this){                             //Is block se single threading system ban jayega
            count++;
        }
    }
}

class CounterTest extends Thread{
    Counter counter;

    CounterTest(Counter counter){
        this.counter = counter;
    }
    @Override
    public void run() {
        for (int i=1; i<=1000; i++){
            counter.increment();
        }
    }
}

public class Test {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        CounterTest t1 = new CounterTest(counter);
        CounterTest t2 = new CounterTest(counter);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter.count);
    }
}
//output 2000 ana chahiye but bar bar run karne par value change ho raha h iska reason Race condition h.
//Solution of this problem is Synchronization.
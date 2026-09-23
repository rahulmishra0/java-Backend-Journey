
class MyThread2 implements Runnable{
    @Override
    public void run() {
        for (int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}

class MyThread extends Thread{

    @Override
    public void run() { //run is method of Runnable and it is abstract method
        for (int i=0; i<5; i++){
            //System.out.println("Child Thread : "+i);
            System.out.println(Thread.currentThread().getName()+" "+i);

        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {

        //1. How to create thread : create class and make object
        MyThread t1 = new MyThread(); //object
        //t1.run(); //normal method calling or sequence calling
        t1.start(); //start() -> Multithreading enable : thread will created

        //MyThread2 t2 = new MyThread2();
        //t2.start(); //not possible
        //Kyuki Runnable ek interface h jiska object nahi banta means yaha start() work nahi karega
        //=>Creating a task is responsibility of run() method, which is from runnable
        //but creating a thread is responsibility of thread class, because start() method is only available in Thread class.
        //iska matalb sirf runnable use karenge tab bhi Thread class ka object chahiye
        MyThread2 t2 = new MyThread2();
        Thread thread = new Thread(t2); //t2 dala h for link to know the task because t2 hi task ko janta h
        thread.start();


        for(int i=0; i<5; i++){
            //System.out.println("Main Thread : "+i);
            System.out.println(Thread.currentThread().getName()+" "+i);

        }
    }
}

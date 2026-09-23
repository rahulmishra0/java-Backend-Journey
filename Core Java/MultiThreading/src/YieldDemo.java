
class MyThread5 extends Thread{
    @Override
    public void run() {
        for (int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName()+" : "+i);
            Thread.yield(); //willing by child thread
        }
    }
}

public class YieldDemo {
    public static void main(String[] args) {

        MyThread5 t1 = new MyThread5();
        t1.start();
        for (int i=0; i<5; i++){
            System.out.println("Main thread");
        }
    }
}

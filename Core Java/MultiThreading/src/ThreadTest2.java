
class MyThread3 extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" child");
        System.out.println("Running.....");
    }
}

public class ThreadTest2 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+" Main");
        MyThread3 t2 = new MyThread3();
        t2.setName("Child-thread"); //to set thread name
        t2.start();
        //t2.start(); //Not possible -> one thread object can be start only once
        //but new reference ke through kr sakte h
        //MyThread3 t3 = new MyThread3();
        //t3.start();
    }
}

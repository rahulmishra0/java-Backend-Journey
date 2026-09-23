
class Payment implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
            System.out.println("Payment is done.....");
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {

        Payment p1 = new Payment();
        Thread t1 = new Thread(p1);
        t1.start();
        System.out.println("Reading more info.. from database");

        //.............
        t1.join(); //this line also executed by main thread so main thread will wait for t1
        System.out.println("Notification sent to user....");
    }
}
//here problem ye aa rahi h ki payment hone se pahle hi Payment done ka notification aa gaya user ko
//so we use join -> join means waiting state (ye pahle uss kaam ko complete hone dega fir join karega)
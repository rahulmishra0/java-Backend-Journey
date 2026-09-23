package Thread;

public class Main {
    public static void main(String[] args) {
        //MyClass myClass = new MyClass();
        //Myclass ki jagah lambda expression use kar sakte h
        Runnable runnable = () ->{
            for (int i=0; i<10; i++){
                System.out.println("Hello"+i);
            }
        };
        Thread thread = new Thread(runnable);
        thread.run();


    }
}

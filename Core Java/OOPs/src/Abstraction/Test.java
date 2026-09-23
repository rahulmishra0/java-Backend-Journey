package Abstraction;

public class Test {
    public static void main(String[] args) {
        Vehicle v1 = new Bike();
        //Abhi bhi LHS ka blueprint nahi h bike ka but fir bhi uska method call ho gaya because of Abstraction
        v1.start();

        System.out.println(".........");
        Vehicle v2 = new Car();
        v2.start();
    }
}

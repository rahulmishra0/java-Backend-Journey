package Solution_UseInterface;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(new DieselEngine()); //Abb hum yaha se decide karenge ki kyun sa Engine use karna h
                                              //Jisse loose coupling hogi
        car.drive();
    }
}
//Isme 2 chije use hui
//1. we are creating an object.
//2. Injecting that object into a car class using Constructor
//That is called Dependency Injection
//And ye manually ho raha h

//Isse Car class ki koi dependency nahi h kisi par
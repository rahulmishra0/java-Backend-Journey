package Abstraction;

//abstract -> abstract class means isme method bana sakte h without implication(no body)
abstract public class Vehicle {

    abstract void start();
}
class Car extends Vehicle{

    @Override
    void start(){
        System.out.println("Car start with key");
    }
}
class Bike extends Vehicle{
    @Override
    void start() {
        System.out.println("Bike start with self button");
    }
}

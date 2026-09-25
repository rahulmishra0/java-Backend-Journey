package org.example;

public class CarByConstructor {

    private Engine engine;

    public CarByConstructor(Engine engine) {
        System.out.println("Car constructor");
        this.engine = engine;
    }

    public void drive(){
        System.out.println("Autowiring byConstructor");
        engine.start();
        System.out.println("Car is running");
    }
}

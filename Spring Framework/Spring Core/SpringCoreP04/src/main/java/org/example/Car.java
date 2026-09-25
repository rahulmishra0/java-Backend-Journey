package org.example;

public class Car {

    private Engine engine;

    public Car() {
        System.out.println("Car constructor");
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void drive(){
        System.out.println("Autowiring byType");
        engine.start();
        System.out.println("Car is running");
    }
}

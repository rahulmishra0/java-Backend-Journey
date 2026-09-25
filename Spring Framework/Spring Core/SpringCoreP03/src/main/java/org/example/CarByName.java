package org.example;

public class CarByName {

    private Engine engine;

    public CarByName() {
        System.out.println("Car constructor");
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void drive(){
        System.out.println("Autowiring byName");
        engine.start();
        System.out.println("Car is running");
    }
}

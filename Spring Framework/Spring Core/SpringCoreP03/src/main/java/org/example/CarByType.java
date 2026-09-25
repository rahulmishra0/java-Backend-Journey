package org.example;

public class CarByType {

    private Engine engine;

    public CarByType() {
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

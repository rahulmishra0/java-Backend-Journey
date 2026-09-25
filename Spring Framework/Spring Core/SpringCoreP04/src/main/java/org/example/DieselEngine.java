package org.example;

public class DieselEngine implements Engine{

    public DieselEngine() {
        System.out.println("Diesel constructor");
    }

    @Override
    public void start() {
        System.out.println("Diesel engine started");
    }
}

package org.example;

public class DieselEngine implements Engine{

    //constructor
    public DieselEngine(){
        System.out.println("Diesel Engine initialized");
    }


    @Override
    public void start() {
        System.out.println("Diesel Engine Started");
    }
}

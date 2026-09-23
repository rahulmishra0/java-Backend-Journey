package org.example;

public class PetrolEngine implements Engine{

    //constructor
    public PetrolEngine(){
        System.out.println("Petrol Engine initialized");
    }
    @Override
    public void start() {
        System.out.println("Petrol Engine Started");
    }
}

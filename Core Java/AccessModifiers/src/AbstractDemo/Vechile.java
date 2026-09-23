package AbstractDemo;

abstract class Vechile {

    //instance variable
    String name;

    //constructor available to give value of instance variable
    Vechile(){

    }

    abstract void start();

    //normal method
    void stop(){
        System.out.println("Vehicle stop");
    }
}
class BMW extends Vechile{

    @Override
    void start(){

    }
}

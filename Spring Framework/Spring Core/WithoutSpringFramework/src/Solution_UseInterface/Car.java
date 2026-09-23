package Solution_UseInterface;

public class Car {
    //yaha Engine me variety of engine ke object daal sakte h
    //means left side is fixed but right side baar baar change hoga.
    //private Engine engine = new DieselEngine();

    //isliye aise use karenge
    private Engine engine;

    public Car(Engine engine){
        this.engine = engine;
    }

    public void drive(){
        engine.start();
        System.out.println("Car is moving");
    }

}

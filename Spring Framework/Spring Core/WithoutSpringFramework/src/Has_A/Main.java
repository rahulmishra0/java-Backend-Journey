package Has_A;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.startCar();
    }
}
//Composition (Has-A) se hamne jo unnecessary method (parent to child) load ho raha tha memory m by using Is-A usse to bach gaye
//But new problem aa gayi that is Tight Coupling.

//ex: Who is creating the Engine? => Car class
//That mean Car is responsible for -> Using Engine + Creating Engine
//=> Then this Car class become tightly coupled with Engine class.

//Solution -> Program to an Interface.
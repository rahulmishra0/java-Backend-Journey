
interface Parent {
    default void sayHello(){ //default is mandatory in interface
        System.out.println("Hello");
    }
}
class Child implements Parent{

}

public class DefaultMethod {

    public static void main(String[] args) {

        Child c = new Child();
        c.sayHello(); //after java 8 directly access kar pa rahe warna pahle Child ke ander iski implementation likhte then use (this is benefit of default) amd child usko override bhi kar sakta h
    }
}

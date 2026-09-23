package Functional_Interface;

import java.lang.FunctionalInterface;

//functional interface
@FunctionalInterface //no need to write but ye compiler ko batata h ki ye functional interface h.
public interface MyInterface {
    public void sayHello(); //one abstract method
                            //but we can create many default and static methods
    //default
    default void sayBye(){

    };
    //static
    public static void hey(){

    };

}

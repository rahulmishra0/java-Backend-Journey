package Supplier;
//It is also a functional interface that have single abstract method get().
//It is only Return the Value

import java.util.function.Supplier;

public class Supplier01 {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> 100;
        System.out.println(supplier.get());
    }
}

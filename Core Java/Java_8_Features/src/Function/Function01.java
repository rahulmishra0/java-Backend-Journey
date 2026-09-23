package Function;
//Function -> It is also a functional interface that have single abstract method apply()
//it is not just check the condition like Predicate its do some Work or operation.

import java.util.function.Function;

public class Function01 {
    public static void main(String[] args) {
        Function<String, Integer> function = x -> x.length(); //Find string length
        System.out.println(function.apply("Rahul"));
    }
}

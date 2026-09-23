package Function;

import java.util.function.Function;

public class Function02 {
    public static void main(String[] args) {
        Function<Integer, Integer> function1 = x -> 2 * x;
        Function<Integer, Integer> function2 = x -> x * x * x;

        //Function Chaining
        System.out.println(function1.andThen(function2).apply(3)); //216
        System.out.println(function2.andThen(function1).apply(3)); //54
        //OR -> andThen ki jagha use compose
        System.out.println(function1.compose(function2).apply(3)); //54


    }
}

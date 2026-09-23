package Predicates;
//predicate -> In is Functional interface that have single abstract method test()
// It represent as Boolean Valued Function


import java.util.function.Predicate;

public class Predicate01 {
    public static void main(String[] args) {

        //Predicate just hold the condition like if else
        Predicate<Integer> predicate = x -> x > 100000; //salary greater then one lakh
        System.out.println(predicate.test(100000000));
    }
}

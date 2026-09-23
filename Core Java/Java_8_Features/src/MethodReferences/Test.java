package MethodReferences;

//Method references allow us to refer to a method without invoking it, making our code cleaner and more readable.
//They can be used in place of a lambda expression when the lambda expression only calls an existing method.

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void print(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        List<String> students = Arrays.asList("Alice", "Bob", "Charlie");

        //using Lambda expression
        //students.forEach(x -> System.out.println(x));

        //Or Use method reference
        students.forEach(Test :: print); //method reference
    }
}

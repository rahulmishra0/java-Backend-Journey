package ConstructorReference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        //List<Student> students = names.stream().map(x -> new Student(x)).collect(Collectors.toList());

        //Instead of lambda use constructor reference
        List<Student> students = names.stream().map(Student :: new).collect(Collectors.toList());
    }
}

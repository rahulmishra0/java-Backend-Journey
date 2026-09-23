package LinkedHashSetDemo;

import java.util.LinkedHashSet;

public class LinkedHashSetP01 {
    public static void main(String[] args) {
        LinkedHashSet<String> courses = new LinkedHashSet<>();
        courses.add("Java");
        courses.add("Spring Boot");
        courses.add("Kafka");
        courses.add("JDBC");

        System.out.println(courses);
    }
}

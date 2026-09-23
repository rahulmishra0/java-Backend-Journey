package ListDemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemoP03 {
    public static void main(String[] args) {

        List<String> students = new ArrayList<>();
        students.add("Aman");
        students.add("Raj");
        students.add("Kunal");
        students.add("Rahul");
        students.add("Mohit");

        students.add(1, "Neha"); //First index value replace with Neha
        System.out.println(students);

        System.out.println(students.get(2));

        students.set(2, "Neha");
        students.remove("Aman");

        System.out.println(students);
    }
}

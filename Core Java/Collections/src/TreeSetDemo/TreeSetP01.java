package TreeSetDemo;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetP01 {
    public static void main(String[] args) {
        //use for sorting
        Set<Integer> s = new TreeSet<>();
        s.add(10);
        s.add(90);
        s.add(50);
        s.add(40);

        System.out.println(s);

        Set<String> names = new TreeSet<>();
        names.add("zorawar");
        names.add("babli");
        names.add("aradhya");
        names.add("ashwani");
        names.add("rahul");
        System.out.println(names);

        //Navigable set
        TreeSet<Integer> salaries = new TreeSet<>();
        salaries.add(30000);
        salaries.add(50000);
        salaries.add(70000);
        salaries.add(90000);

        System.out.println(salaries.lower(70000)); //strictly less than x
        System.out.println(salaries.floor(70000)); //less than or equal to x
        System.out.println(salaries.higher(70000)); //strictly greater then x
        System.out.println(salaries.ceiling(70000)); //greater than or equal to x

        TreeSet t = new TreeSet();
        t.add("k");
        t.add("z");
        t.add("A");
        t.add("A");
        t.add("T");
        System.out.println(t); //compareTo work here with ASCII value
    }
}

package ComparableAndComparator;

import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<ComparableDemo> comparableDemos = new TreeSet<>();
        System.out.println("Adding Rahul");
        comparableDemos.add(new ComparableDemo(10, "Rahul"));

        System.out.println("Adding Neha");
        comparableDemos.add(new ComparableDemo(5, "Neha"));

        System.out.println("Adding Amit");
        comparableDemos.add(new ComparableDemo(20, "Amit"));

        System.out.println("Adding Riya");
        comparableDemos.add(new ComparableDemo(15, "Riya"));

        System.out.println(comparableDemos);
    }
}

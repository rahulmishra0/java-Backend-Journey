package LinkedListDemo;

import java.util.LinkedList;

public class LinkedListP02 {
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<>();
        ls.add("A");
        ls.add("B");
        ls.add("C");
        ls.add("D");
//        ls.addFirst("A");
//        ls.addLast("B");

        System.out.println(ls.get(3));
    }
}

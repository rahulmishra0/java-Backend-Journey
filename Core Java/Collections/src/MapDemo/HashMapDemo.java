package MapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> student = new HashMap<>();
        student.put(101, "Aman");
        student.put(104, "Priya");
        student.put(102, "Raman");
        student.put(103, "Riya");

        System.out.println(student);

        Set<Integer> set = student.keySet();
        System.out.println(set);

        Set<Map.Entry<Integer, String>> entries = student.entrySet();
        System.out.println(entries);

        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();
        System.out.println(iterator);

        while (iterator.hasNext()){
            Map.Entry<Integer, String> next = iterator.next();
            System.out.println(next.getKey());
            System.out.println(next.getValue());
        }


    }
}

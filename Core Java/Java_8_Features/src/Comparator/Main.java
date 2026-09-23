
//Comparator use for custom sorting
package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(9);
        list.add(1);
        list.add(7);
        //Collections.sort(list, new MyClass());
        //Myclass ki jagh lambda use
        Collections.sort(list,(a,b) -> b-a );
        System.out.println(list);
    }
}

package ListDemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemoP02 {
    public static void main(String[] args) {

        //Good practice with using generics
        List<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        for (int ele : l1){ //to print element
            System.out.print(ele +" ");
        }
        System.out.println();//for space
        //Or
        System.out.println(l1); //for List

        System.out.println(l1.get(3)); //for index value
    }
}

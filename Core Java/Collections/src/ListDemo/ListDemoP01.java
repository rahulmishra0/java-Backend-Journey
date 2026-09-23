package ListDemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemoP01 {

    public static void main(String[] args) {

        //This is bad practice without using Genric(<>) with wrapper classes
        List list = new ArrayList<>();
        list.add(10);
        list.add(true);
        list.add("Rahul");
        list.add(20);
        list.add(10);
        System.out.println(list);
    }
}

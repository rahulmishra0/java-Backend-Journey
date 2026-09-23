package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperation {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 4233, 9, 0, 5, 44, 23, 433, 0, 1, 2, 46, 88, 90);

        //Operations
        List<Integer> filteredList = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        //System.out.println(filteredList); //only even number
        List<Integer> mappedList = filteredList.stream().map(x -> x / 2).collect(Collectors.toList());
        //System.out.println(mappedList); //number divide by 2.

        List<Integer> operations = list.stream()
                .filter(x -> x % 2 == 0)          //select even number
                .map(x -> x / 2)                  //even number divide by 2
                .distinct()                              //block repeated number
                .sorted((a, b) -> (b - a)) //descending sorted
                .limit(4)                        //only starting 4 element
                .skip(2)                              //skip starting 2 element
                .collect(Collectors.toList());           //wapas convert in list
                 //and many more operations available
        System.out.println(operations);

    }
}

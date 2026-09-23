package Predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Stream1 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        //Stream is way to play any collection in functional way
        //=> Stream = Functional programming(a.d.h....)

//        int sum = 0;
//        for (int number : numbers){
//            if (number%2 == 0){
//                sum += number;
//            }
//        }
        //instead of using 5 line even sum
        //Use new way one line code that is combination of Stream + Predicate.
        numbers.stream().filter(n-> n%2 == 0).mapToInt(n -> n).sum();

    }
}

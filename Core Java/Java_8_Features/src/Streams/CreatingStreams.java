package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStreams {

    public static void main(String[] args) {

        //ex 1
        List<String> list = Arrays.asList("apple", "banana", "cherry");
        Stream<String> MYStream = list.stream();//convert in stream

        //ex 2
        String[] array = {"apple", "banana", "cherry"};
        Stream<String> stream = Arrays.stream(array);

        //direct stream convert
        Stream<Integer> integerStream = Stream.of(1, 2, 3);

        //or

        Stream<Integer> limit = Stream.iterate(0, n -> n + 1).limit(100);
        
        //or

        Stream.generate(() -> "hello").limit(5);
    }
}

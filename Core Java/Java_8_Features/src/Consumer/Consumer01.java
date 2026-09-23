package Consumer;
//It is also a functional interface that have single abstract method accept().
//It just consume the value (data use)

import java.util.function.Consumer;

public class Consumer01 {
    public static void main(String[] args) {
        Consumer<String> consumer = (s) -> System.out.println(s);
        consumer.accept("Rahul");
    }
}

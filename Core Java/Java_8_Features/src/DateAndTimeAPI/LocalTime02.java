package DateAndTimeAPI;

import java.time.LocalTime;

public class LocalTime02 {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime custom = LocalTime.of(03, 00, 00);
        System.out.println(custom);
    }
}

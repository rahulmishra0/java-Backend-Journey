package DateAndTimeAPI;

import java.time.LocalDateTime;

public class LocalDateTime03 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime custom = LocalDateTime.of(2026, 9, 03, 07, 00);
        System.out.println(custom);
    }
}

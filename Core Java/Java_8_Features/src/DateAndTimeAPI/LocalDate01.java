package DateAndTimeAPI;

import java.time.LocalDate;
import java.time.Month;

public class LocalDate01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now(); //today date
        System.out.println(now);

        //custom date
        LocalDate myDate = LocalDate.of(2001, 12, 15);
        System.out.println(myDate);

        int dayOfMonth = now.getDayOfMonth();
        Month month = now.getMonth();
        int year = now.getYear();
        System.out.println(dayOfMonth);
        System.out.println(month);
        System.out.println(year);

    }
}

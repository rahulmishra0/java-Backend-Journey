package DateAndTimeAPI;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonedDateTime04 {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        //print All Time Zone
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        availableZoneIds.forEach(System.out::println);
    }
}

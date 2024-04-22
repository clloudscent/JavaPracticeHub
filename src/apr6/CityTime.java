package apr6;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CityTime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the city name: ");
        String cityName = scanner.nextLine();

        Map<String, String> cityTimeZoneMap = new HashMap<>();
        cityTimeZoneMap.put("Tokyo", "Asia/Tokyo");
        cityTimeZoneMap.put("New York", "America/New_York");
        cityTimeZoneMap.put("Los Angeles", "America/Los_Angeles");
        cityTimeZoneMap.put("London", "Europe/London");
        cityTimeZoneMap.put("Paris", "Europe/Paris");
        // Add more cities and their time zones here.

        String timeZone = cityTimeZoneMap.get(cityName);

        if (timeZone != null) {
            ZoneId zoneId = ZoneId.of(timeZone);
            ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), zoneId);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            String formattedDateTime = zonedDateTime.format(formatter);
            System.out.println("Current time in " + cityName + ": " + formattedDateTime);
        } else {
            System.out.println("City not found or not supported.");
        }
        scanner.close();
    }
}

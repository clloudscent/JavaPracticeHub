package apr6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class RealTimeCalendar {
    public static void main(String[] args) {
        LocalDate.now(DateTimeFormatter.ofPattern("yyyy-MM-dd").getZone());
    }
}

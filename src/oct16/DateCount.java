package oct16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCount {
    public static void main(String[] args) throws ParseException {
        String currentDate = "2023-10-16";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date date = dateFormat.parse(currentDate);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        //100일 뒤
        cal.add(Calendar.DATE, 100);
        System.out.println("100일 뒤: " + dateFormat.format(cal.getTime()));

        //200일 뒤
        cal.add(Calendar.DATE, 200);
        System.out.println("200일 뒤: " + dateFormat.format(cal.getTime()));


        //365일 뒤
        cal.add(Calendar.DATE, 365);
        System.out.println("365일 뒤: " + dateFormat.format(cal.getTime()));

    }
}

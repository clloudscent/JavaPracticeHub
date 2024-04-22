package jul14;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pratice {
    public static void main(String[] args) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
        System.out.println(timestamp);

        Logger logger = Logger.getInstance();
        logger.info("정보 메시지 입니다.");
    }
}

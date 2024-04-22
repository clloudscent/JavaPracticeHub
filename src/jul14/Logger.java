package jul14;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static Logger singleton = new Logger();
    private Logger(){};

    public static Logger getInstance(){
        return singleton;
    }

    private String logFilePath="/Users/mac/logs/logger-practice/logfile.log";

    public void info(String message) {
        log("INFO", message);
    }

    public void warn(String message) {
        log("WARNING", message);
    }

    public void error(String message){
        log("ERROR", message);
    }

    private void log(String logLevel, String message) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
        String logMessage = "[" + timestamp + "] [" + logLevel + "] [" + message + "]\n";
        System.out.println(logMessage);
        try {
            Files.write(Paths.get(logFilePath), logMessage.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        }catch(Exception e){
            e.printStackTrace();
        }

    }


}

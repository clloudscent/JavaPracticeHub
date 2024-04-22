package oct10;

import lombok.Data;

import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Set;

@Data

public class Practice01 {
    public static void main(String[] args) throws Exception{

        String userHome = System.getProperty("user.home");
        File file = new File(userHome);
        System.out.println(userHome);
        File[] contents = file.listFiles();

        for(File temp : contents) {
            System.out.println(temp.getPath());
        }
    }
}

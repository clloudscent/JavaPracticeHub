package sep08;

import java.io.File;

public class FilePractice {
    public static void main(String[] args) {
        String filePath = "";
        filePath = "/Users/mac/javapractice/song.text";

        File file = new File(filePath);
        System.out.println(file.isDirectory());
    }
}

package tcpPracticeMay08;

import java.io.FileOutputStream;
import java.io.IOException;

public class FilePractice {
    public static void main(String[] args) throws IOException {
        String baseDirPath = "/Users/mac/filepractice/";
        String fileName = "temptemp.txt";
        FileOutputStream fos = new FileOutputStream(baseDirPath+fileName);
    }
}

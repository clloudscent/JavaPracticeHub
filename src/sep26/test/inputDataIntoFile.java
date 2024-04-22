package sep26.test;

import java.io.FileWriter;
import java.io.IOException;

public class inputDataIntoFile {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("/Users/mac/javapractice/student.txt", true);
        fw.write("홍길동");
        fw.write(",");
        fw.write("202301");
        fw.write(",");
        fw.write("20");
        fw.write("\n");
        fw.write("신짱구");
        fw.write(",");
        fw.write("202311");
        fw.write(",");
        fw.write("22");
        fw.write("\n");
    }
}

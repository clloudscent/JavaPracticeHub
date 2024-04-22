package sep22;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterPractice {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        try {
            FileWriter fw = new FileWriter("/Users/mac/javapractice/student.txt", true);
            sc.nextLine();
            fw.write("test");
            fw.close();
            System.out.println("입력이 완료되었습니다!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

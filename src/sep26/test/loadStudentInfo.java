package sep26.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class loadStudentInfo {
    public static void main(String[] args) throws IOException {
        //번호를 입력했을 때, 번호에 해당하는 학생정보를 불러오기
        Scanner sc = new Scanner(System.in);

        String fileName = "/Users/mac/javapractice/student.txt";
        Path filePath = Path.of(fileName);
        String content = Files.readString(filePath);
        String[] studentList = content.split("\n");
        for (int i = 0; i < studentList.length; i++) {
            String studentText = studentList[i];
            String[] studentInfo = studentText.split(",");
            int num = i + 1;
            System.out.println(num + "번");
            System.out.println("이름: " + studentInfo[0]);
            System.out.println("학번: " + studentInfo[1]);
            System.out.println("나이: " + studentInfo[2]);
        }

        System.out.print("번호를 입력하세요:");
        int inputNum = sc.nextInt();
        String[] studentInfo = studentList[inputNum - 1].split(",");
        System.out.println("이름: " + studentInfo[0]);
        System.out.println("학번: " + studentInfo[1]);
        System.out.println("나이: " + studentInfo[2]);
    }
}

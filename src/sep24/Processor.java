/*
package sep24;

package sep22;

import org.jetbrains.annotations.NotNull;
import sep22.Student;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Processor {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        boolean isRunnable = true;

        while (isRunnable) {
            System.out.println("" +
                    "1. 학생정보입력" +
                    "2. 학생정보읽기" +
                    "3. end");
            int inputNum = sc.nextInt();
            sc.nextLine();
            switch (inputNum) {
                case 1:
                    for (int i = 0; i < 2; i++) {
                        Student student = new Student();
                        System.out.println("학생이름: ");
                        student.name = sc.nextLine();
                        System.out.println("학번입력: ");
                        student.studentCode = sc.nextLine();
                        System.out.println("나이입력: ");
                        student.age = sc.nextLine();
                        enroll(student);
                    }

                    break;

                case 2:
                    read();
                    break;

                case 3:
                    isRunnable = false;
                    break;
            }
        }


    }

    public static void enroll(Student student) {
        try {
            FileWriter fw = new FileWriter("/Users/mac/javapractice/student.txt", true);
            fw.write(student.name);
            fw.write(",");
            fw.write(student.studentCode);
            fw.write(",");
            fw.write(student.age);
            fw.write("\n");
            fw.close();
            System.out.println("입력이 완료되었습니다!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void read() throws IOException {
        List<Student> studentArrayList = new ArrayList<>();
        String fileName = "/Users/mac/javapractice/student.txt";
        Path filePath = Path.of(fileName);
        String content = Files.readString(filePath);
        String[] studentList = content.split("\n");
        for (int i = 0; i < studentList.length; i++) {
            Student std = new Student();
            String studentText = studentList[i];
            String[] studentInfo = studentText.split(",");
            System.out.println("이름: " + studentInfo[0]);
            System.out.println("학번: " + studentInfo[1]);
            System.out.println("나이: " + studentInfo[2]);
            std.name = studentInfo[0];
            std.studentCode = studentInfo[1];
            std.age = studentInfo[2];
            studentArrayList.add(std);
        }
    }

    public static void edit(String ){

    }

}

*/

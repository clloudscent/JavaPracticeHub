package sep22;

import jul26.practice03.E;
import org.jetbrains.annotations.NotNull;

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
        List<Student> studentArrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean isRunnable = true;

        while (isRunnable) {
            System.out.println("" +
                    "1. 학생정보입력" +
                    "2. 학생정보읽기" +
                    "3. 학생정보수정하기");
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
                    try {
                        read(studentArrayList);
                    } catch (IOException e) {
                        e.getMessage();
                    }
                    break;

                case 3:
                    System.out.println("수정할 학생의 번호를 입력해주세요");
                    System.out.println("->");
                    int num = sc.nextInt();
                    sc.nextLine();
                    System.out.print("학생의 수정될 이름을 입력해 주세요: ");
                    String editName = sc.nextLine();
                    System.out.print("학생의 수정될 학번을 입력해 주세요: ");
                    String editStudentCode = sc.nextLine();
                    System.out.print("학생의 수정될 나이를 입력해 주세요: ");
                    String editAge = sc.nextLine();
                    edit(num, editName, editStudentCode, editAge, studentArrayList);
                    break;

                case 4:
                    isRunnable = false;
                    break;
            }
        }


    }

    public static void enroll(Student student) {
        try {
            FileWriter fw = new FileWriter("/Users/mac/javapractice/student.txt", false);
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

    public static void read(List<Student> studentArrayList) throws IOException {
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

    public static void edit(int inputNum, String name, String studentCode, String age, List<Student> studentArrayList) throws IOException {
        FileWriter fw = new FileWriter("/Users/mac/javapractice/student.txt", false);
        //홍길동,202301,20
        // 신짱구,2023,02
        try {
            String fileName = "/Users/mac/javapractice/student.txt";
            Path filePath = Path.of(fileName);
            String content = Files.readString(filePath);
            String[] studentList = content.split("\n");

            for (int i = 0; i < studentList.length; i++) {
                Student std = new Student();
                String studentText = studentList[i];
                String[] studentInfo = studentText.split(",");
                std.name = studentInfo[0];
                std.studentCode = studentInfo[1];
                std.age = studentInfo[2];
            }

        } catch (IOException e) {
            e.getMessage();
        }
        System.out.println(studentArrayList);
    }
}

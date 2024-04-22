package sep26.test;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Processor {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        List<Student> studentInfoList = new ArrayList<>();

        boolean isRunnable = true;


        while (isRunnable) {
            System.out.println("" +
                    "1.학생정보입력하기" +
                    "2.학생정보불러오기" +
                    "3.학생정보수정하기" +
                    "4. 종료하기");
            int processorNum = sc.nextInt();
            sc.nextLine();

            switch (processorNum) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        Student std = new Student();
                        System.out.print("이름: ");
                        String name = sc.nextLine();
                        System.out.println("학번: ");
                        String studentCode = sc.nextLine();
                        System.out.println("나이: ");
                        String age = sc.nextLine();
                        std.name = name;
                        std.studentCode = studentCode;
                        std.age = age;
                        inputStudentInfo(std);
                    }
                    break;

                case 2:
                    loadStudentInfo(studentInfoList);
                    break;

                case 3:
                    //수정하기
//                    studentInfoList.clear();
                    loadStudentInfo(studentInfoList);
                    System.out.print("번호를 입력하세요:");
                    int inputStudentNum = sc.nextInt();
                    sc.nextLine();
                    //변경하기

                    System.out.println("수정하기");
                    System.out.print("이름: ");
                    String name = sc.nextLine();
                    System.out.print("학번: ");
                    String studentCode = sc.nextLine();
                    System.out.print("나이: ");
                    String age = sc.nextLine();

                    studentInfoList.get(inputStudentNum - 1).name = name;
                    studentInfoList.get(inputStudentNum - 1).studentCode = studentCode;
                    studentInfoList.get(inputStudentNum - 1).age = age;

                    FileWriter fw = new FileWriter("/Users/mac/javapractice/student.txt", false);
                    for (int i = 0; i < studentInfoList.size(); i++) {
                        fw.write(studentInfoList.get(i).name);
                        fw.write(",");
                        fw.write(studentInfoList.get(i).studentCode);
                        fw.write(",");
                        fw.write(studentInfoList.get(i).age);
                        fw.write("\n");
                    }
                    fw.close();
                    break;

                case 4:
                    isRunnable = false;
                    System.out.println("프로그램 종료");
                    break;
            }
        }

    }

    public static void inputStudentInfo(Student std) throws IOException {
        FileWriter fw = new FileWriter("/Users/mac/javapractice/student.txt", true);
        fw.write(std.name);
        fw.write(",");
        fw.write(std.studentCode);
        fw.write(",");
        fw.write(std.age);
        fw.write("\n");
        fw.close();
    }

    public static void loadStudentInfo(List<Student> studentInfoList) throws IOException {
        studentInfoList.clear();
        //Path 객체 생성
        String fileName = "/Users/mac/javapractice/student.txt";
        Path filePath = Path.of(fileName);

        //content 안에 파일안에 들어있는 데이터 객체를 담는다
        //줄바꿈을 기준으로 split() 사용하여 분류하여 학생별 데이터 분류하기
        String content = Files.readString(filePath);
        String[] studentList = content.split("\n");

        //split 로 분류된 i 번째의 학생 데이터(이름,학번,나이)를 ","로 또 한번 이름, 학번, 나이로 분류하여 분류된 데이터를 차례로
        //student 객체안의 이름,학번, 나이에 넣고
        //리스트에 학생객체를 add 한다.
        for (int i = 0; i < studentList.length; i++) {
            String studentText = studentList[i];
            int num = i + 1;
            System.out.println(num + "번");
            String[] studentInfo = studentText.split(",");
            System.out.println("이름: " + studentInfo[0]);
            System.out.println("학번: " + studentInfo[1]);
            System.out.println("나이: " + studentInfo[2]);
            Student std1 = new Student();
            std1.name = studentInfo[0];
            std1.studentCode = studentInfo[1];
            std1.age = studentInfo[2];
            studentInfoList.add(std1);
        }
    }
}

package sep26.test;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoadAndEdit {
    public static void main(String[] args) throws IOException {
        //번호를 입력했을 때, 번호에 해당하는 학생정보를 불러오기
        Scanner sc = new Scanner(System.in);
        List<Student> studentArrayList = new ArrayList<>();

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
        sc.nextLine();
        String[] studentInfo = studentList[inputNum - 1].split(",");
        System.out.println("이름: " + studentInfo[0]);
        System.out.println("학번: " + studentInfo[1]);
        System.out.println("나이: " + studentInfo[2]);

        //StudentArrayList 에 학생정보 넣기
        for (int i = 0; i < studentList.length; i++) {
            Student std = new Student();
            String studentText = studentList[i];
            String[] studentInfo2 = studentText.split(",");
            std.name = studentInfo2[0];
            std.studentCode = studentInfo2[1];
            std.age = studentInfo2[2];
            studentArrayList.add(std);
        }

        //변경하기
        System.out.println("수정하기");
        System.out.print("이름: ");
        String name = sc.nextLine();
        System.out.print("학번: ");
        String studentCode = sc.nextLine();
        System.out.print("나이: ");
        String age = sc.nextLine();

        studentArrayList.get(inputNum-1).name = name;
        studentArrayList.get(inputNum-1).studentCode = studentCode;
        studentArrayList.get(inputNum-1).age = age;
        System.out.println(studentArrayList.get(inputNum-1).name);
        System.out.println(studentArrayList.get(inputNum-1).studentCode);
        System.out.println(studentArrayList.get(inputNum-1).age);

        FileWriter fw = new FileWriter("/Users/mac/javapractice/student.txt",false);
        for(int i =0; i<studentArrayList.size(); i++){
            fw.write(studentArrayList.get(i).name);
            fw.write(",");
            fw.write(studentArrayList.get(i).studentCode);
            fw.write(",");
            fw.write(studentArrayList.get(i).age);
            fw.write("\n");
        }
        fw.close();
    }
}

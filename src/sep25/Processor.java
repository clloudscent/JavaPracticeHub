package sep25;

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
        List<Student> studentArrayList = new ArrayList<>();
        boolean isRunnable = true;
        while(isRunnable){
            System.out.println("" +
                    "1. 학생정보입력" +
                    "2. 학생정보읽기" +
                    "3. 학생정보수정하기");
            int inputNum = sc.nextInt();
            sc.nextLine();
            switch (inputNum){
                case 1:
                    //1. 학생정보입력
                    for(int i =0; i<2; i++){//3명
                        Student student = new Student();
                        System.out.print("학생이름:");
                        student.name = sc.nextLine();
                        System.out.println("학번입력: ");
                        student.studentCode = sc.nextLine();
                        System.out.println("나이입력: ");
                        student.age = sc.nextLine();
                        enroll(student);
                    }
                    break;

                case 2:
                    //2. 학생정보읽기
                    try{
                        read(studentArrayList);
                    }catch (IOException e){
                        e.getMessage();
                    }
                    break;

                case 3:
                    //3. 학생정보수정
                    System.out.println("학생번호: ");
                    int inputEditNum = sc.nextInt();
                    sc.nextLine();
                    Student std = new Student();
                    System.out.println("이름: ");
                    std.name = sc.nextLine();
                    System.out.println("학번: ");
                    std.studentCode = sc.nextLine();
                    System.out.println("나이: ");
                    std.age = sc.nextLine();
                    edit(std, inputEditNum);
                    break;

                case 4:
                    //4. 프로그램 종료
                    isRunnable = false;
                    break;
            }
        }

    }
    public static void enroll(Student student){
        try {
            FileWriter fw = new FileWriter("/Users/mac/javapractice/student.txt", true);
            fw.write(student.name);
            fw.write(",");
            fw.write(student.studentCode);
            fw.write(",");
            fw.write(student.age);
            fw.write("\n");
            fw.close();
            System.out.println("입력이 완료되었습니다.");
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void read(List<Student> studentArrayList)throws IOException{
        String fileName = "/Users/mac/javapractice/student.txt";
        Path filePath = Path.of(fileName);
        String content = Files.readString(filePath);
        //홍길동,202301,22
        //임꺽정,202302,26
        String[] studentList = content.split("\n"); //한학생의 전체정보
        for(int i =0; i< studentList.length; i++){
            Student std = new Student();
            String studentText = studentList[i];
            //홍길동,202301,22
            String[] studentInfo = studentText.split(",");
            //학생안에 담긴 개별적인 정보들
            System.out.println("이름: " + studentInfo[0]);
            //홍길동
            System.out.println("학번: " + studentInfo[1]);
            //202301
            System.out.println("나이: " + studentInfo[2]);
            //22
            std.name = studentInfo[0];
            std.studentCode = studentInfo[1];
            std.age = studentInfo[2];
            studentArrayList.add(std);
        }
    }

    public static void edit(Student std, int inputNum) throws IOException {

        //변경될 학생정보, 학생정보가 담긴 리스트, 변경하고싶은 학생의 번호
        List<Student> studentList = new ArrayList<>();

        read(studentList);
        for(int i =0; i<studentList.size(); i++){
            System.out.println(studentList.get(i).name);
            System.out.println(studentList.get(i).studentCode);
            System.out.println(studentList.get(i).age);
        }
        studentList.get(inputNum).name = std.name;
        studentList.get(inputNum).studentCode= std.studentCode;
        studentList.get(inputNum).age = std.age;
        FileWriter fw = new FileWriter("/Users/mac/javapractice/student.txt", false);
        for(int i =0; i<studentList.size(); i++){
            fw.write(studentList.get(i).name);
            fw.write(",");
            fw.write(studentList.get(i).studentCode);
            fw.write(",");
            fw.write(studentList.get(i).age);
            fw.write("\n");
        }
    }
}

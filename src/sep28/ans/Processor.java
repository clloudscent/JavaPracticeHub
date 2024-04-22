package sep28.ans;

import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Processor {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("실행할 번호를 입력해주세요");
            System.out.println("1.학생정보 입력\t2.학생정보 불러오기\t3.학생정보 수정하기\t4.종료");
            System.out.print("번호: ");
            int commandNum = sc.nextInt();
            sc.nextLine();
            switch (commandNum) {
                case 1:
                    System.out.print("생성할 학생 수를 입력: ");
                    int numToMake = sc.nextInt();
                    sc.nextLine();
                    makeStudentInfoFile(numToMake);
                    break;
                case 2:
                    readAndPrintStudentInfoFromFile();
                    break;
                case 3:
                    List<Student> studentList = readAndPrintStudentInfoFromFile();
                    System.out.print("수정할 학생 번호를 입력: ");
                    int numToUpdate = sc.nextInt();
                    sc.nextLine();
                    Student studentToUpdate = makeStudentFromUserInput();
                    studentList.set(numToUpdate - 1, studentToUpdate);
                    writeFileFromStudentList(studentList);

                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }

    }

    public static List<Student> readAndPrintStudentInfoFromFile() throws Exception {
        List<Student> studentList = makeStudentListFromFile();
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println((i + 1) + "번 학생");
            System.out.println(studentList.get(i));
        }
        return studentList;
    }

    public static List<Student> makeStudentInfoFile(int numToMake) throws Exception {
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < numToMake; i++) {
            studentList.add(makeStudentFromUserInput());
        }
        writeFileFromStudentList(studentList);

        return studentList;
    }

    public static Student makeStudentFromUserInput() throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean correctInputValue = false;
        String name = "";
        String studentCode = "";
        String age = "";
        while (correctInputValue==false) {
            System.out.println("학생정보 입력");
            System.out.print("이름: ");
            name = sc.nextLine();
            System.out.print("학번: ");
            studentCode = sc.nextLine();
            System.out.print("나이: ");
            age = sc.nextLine();
            if (isWrongInput(name, 3) || isWrongInput(studentCode, 6) || isWrongInput(age, 2)) {
                correctInputValue = false;
                System.out.println("잘못된 값을 입력하셨습니다. 재 입력해주시기 바랍니다.");
            }else{
                correctInputValue = true;
            }
        }
        return new Student(name, studentCode, age);
    }

    public static void writeFileFromStudentList(List<Student> studentList) throws Exception {
        String filePathString = "/Users/mac/javapractice/studentInfo2.txt";
        FileWriter fw = new FileWriter(filePathString, false);
        for (Student std : studentList) {
            fw.write(std.getName());
            fw.write(",");
            fw.write(std.getStudentCode());
            fw.write(",");
            fw.write(std.getAge());
            fw.write("\n");
        }
        fw.close();
    }

    public static List<Student> makeStudentListFromFile() throws Exception {
        String filePathString = "/Users/mac/javapractice/studentInfo2.txt";
        List<Student> studentList = new ArrayList<>();
        String content = Files.readString(Path.of(filePathString));
        String[] studentStringArray = content.split("\n");

        for (int i = 0; i < studentStringArray.length; i++) {
            studentList.add(makeStudentFromString(studentStringArray[i]));
        }

        return studentList;

    }

    public static Student makeStudentFromString(String studentString) throws Exception {
        String[] studentFieldStringArray = studentString.split(",");
        /*if (studentFieldStringArray.length != 3) {
            throw new Exception("잘못된 형식의 학생 텍스트");
        }*/
        return new Student(studentFieldStringArray[0], studentFieldStringArray[1], studentFieldStringArray[2]);
    }

    public static boolean isWrongInput(String input, int inputLength) throws Exception {
        boolean containsWrongInput = false;
        if ((input.length() != inputLength) || input.contains(",") || input.contains("\n")) {
            System.out.println("올바르지 않은 입력값입니다. 다시 입력해주세요.");
            containsWrongInput = true;
        }
        return containsWrongInput;
    }
}

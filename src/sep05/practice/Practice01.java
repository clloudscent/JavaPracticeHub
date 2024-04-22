package sep05.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int studentNum = 3;
       ArrayList<Student> studentList = new ArrayList<>();
       Student student;
       for(int i =0; i<studentNum; i++){
           System.out.println("학생이름: ");
           String name = sc.nextLine();
           System.out.println("수학점수: ");
           int mathScore = sc.nextInt();
           System.out.println("국어점수: ");
           int koreanScore = sc.nextInt();
           System.out.println("영어점수: ");
           int englishScore = sc.nextInt();
           sc.nextLine();
           student = new Student(name, mathScore, koreanScore, englishScore);
           studentList.add(student);
       }
       for(int i =0; i<studentList.size(); i++){
           System.out.println(studentList.get(i));
       }
    }
}

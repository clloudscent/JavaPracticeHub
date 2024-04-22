package dec29;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AverageScoreMethod {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("학생 수 :");
        int numberOfStudent = sc.nextInt();
        sc.nextLine();
        Map<Integer, Student> studentMap = new HashMap<>();
        for(int i =0; i<numberOfStudent; i++){
                System.out.print("학생 아이디 입력: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("학생 이름 입력: ");
                String name = sc.nextLine();
                System.out.print("수학점수 입력: ");
                int mathScore = sc.nextInt();
                System.out.print("국어점수 입력: ");
                int koreanScore = sc.nextInt();
                System.out.print("영어점수 입력: ");
                int englishScore = sc.nextInt();
                sc.nextLine();
//                Student student1 = new Student(id, name, mathScore, koreanScore,englishScore);
                Student student = new Student();
                student.setId(id);
                student.setName(name);
                student.setMathScore(mathScore);
                student.setKoreanScore(koreanScore);
                student.setEnglishScore(englishScore);

                studentMap.put(id, student);


        }
        System.out.print("학생 ID: >>");
        int inputStudentId = sc.nextInt();
        extractAverage(studentMap, inputStudentId);
    }
     static void extractAverage(Map<Integer, Student> studentMap, int id){
        Student std = studentMap.get(id);
        int averageScore = (std.getMathScore()+std.getKoreanScore()+std.getEnglishScore())/3;
        System.out.println("학생 ID: " + id);
         System.out.println(studentMap.get(id));
         for(Map.Entry<Integer, Student> entry : studentMap.entrySet()){
             System.out.println(entry.getKey()+", "+entry.getValue());
         }

        System.out.println("학생이름: "+ studentMap.get(id).getName());
        System.out.println("평균점수: "+averageScore);

        /*int average = (mathScore + koreanScore + englishScore)/3;


        Map<String, Integer> studentScore = new HashMap<>();
        studentScore.put(id, average);*/
    }
}

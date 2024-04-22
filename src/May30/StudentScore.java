package May30;

import java.util.*;

public class StudentScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<StudentInfo> studentInfoArrayList = new ArrayList<>();

        for(int i =0; i<5; i++){
            StudentInfo studentInfo = new StudentInfo();
            System.out.print("이름:");
            studentInfo.name = sc.nextLine();
            System.out.print("점수:");
            studentInfo.score = sc.nextInt();
            sc.nextLine();
            studentInfoArrayList.add(studentInfo);
        }

        for(int i = 0; i<studentInfoArrayList.size(); i++){
            for(int j =0; j<studentInfoArrayList.size()-i-1; j++){
                if(studentInfoArrayList.get(j).score<studentInfoArrayList.get(j+1).score){
                    StudentInfo temp = studentInfoArrayList.get(j);
                    studentInfoArrayList.set(j, studentInfoArrayList.get(j+1));
                    studentInfoArrayList.set(j+1,temp);
                }
            }
        }

        System.out.println(studentInfoArrayList.toString());


        for(int i = 0; i<studentInfoArrayList.size(); i++){

        }


    }
}

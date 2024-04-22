package march2;

import java.util.*;

public class StudentSorting_ANS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<StudentInfo> studentList = new ArrayList<>();
        for(int i=0; i<5; i++){
            System.out.println("학생번호: ");
            int num = sc.nextInt();
            sc.nextLine();
            System.out.println("학생이름: ");
            String name = sc.nextLine();

            StudentInfo student = new StudentInfo();
            student.setNum(num);
            student.setName(name);
            studentList.add(student);
        }

        System.out.println(studentList);

        for(int i=0; i<studentList.size()-1;i++){
            for(int j=i+1;j<studentList.size();j++){
                if(studentList.get(i).num>studentList.get(j).num){
                    StudentInfo temp = studentList.get(i);
                    studentList.set(i, studentList.get(j));
                    studentList.set(j, temp);
                }
            }
        }
        System.out.println(studentList);
    }
}

package march2;

import java.util.*;

public class StudentSorting2 {
    public static void main(String[] args) {
        List<StudentInfo2> studentList = inputStudentInfo();

        sortStudentList(studentList);

        printList(studentList);


    }
    public static List<StudentInfo2> inputStudentInfo(){
        Scanner sc = new Scanner(System.in);
        List<StudentInfo2> studentList = new ArrayList<>();
        // StudentInfo2 studentInfo2 = new StudentInfo2();
        for(int i=0; i<5; i++){
            StudentInfo2 studentInfo2 = new StudentInfo2();
            System.out.print("학생번호: ");
            int inputNum = sc.nextInt();
            sc.nextLine();
            System.out.print("이름: ");
            String name = sc.nextLine();
            studentInfo2.setNumber(inputNum);
            studentInfo2.setName(name);
            studentList.add(studentInfo2);
        }
        return studentList;
    }

    public static void sortStudentList(List<StudentInfo2> studentList){
        for(int i=0; i<studentList.size()-1; i++){
            for(int j=i+1; j<studentList.size(); j++){
                if(studentList.get(i).getNumber()<studentList.get(j).getNumber()){
                    StudentInfo2 temp = studentList.get(i);
                    studentList.set(i, studentList.get(j));
                    studentList.set(j, temp);
                }
            }
        }
    }

    public static void printList(List<StudentInfo2> studentList){
        for(int i=0; i<studentList.size(); i++){
            System.out.println(studentList.get(i).getName());
        }
    }
}

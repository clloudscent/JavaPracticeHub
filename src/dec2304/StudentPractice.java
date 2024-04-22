package dec2304;

import java.util.ArrayList;
import java.util.List;

public class StudentPractice {
    public static void main(String[] args) {
        List<Student> stdList = new ArrayList<>();
        stdList.add(new Student("22", "홍길동"));
        stdList.add(new Student("1", "임꺽정"));
        stdList.add(new Student("42", "박철수"));
        stdList.add(new Student("55", "홍길동"));
        stdList.add(new Student("31", "박민수"));
        stdList.add(new Student("74", "호날두"));

        findGildongFromList(stdList, "홍길동");
    }
    public static void findGildongFromList(List<Student> studentList, String name){
        for(Student currentStudent : studentList){
            if(currentStudent.name.equals(name)){
                System.out.println(currentStudent.number);
            }
        }
    }
}

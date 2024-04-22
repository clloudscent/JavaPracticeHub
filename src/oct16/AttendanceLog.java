package oct16;

import java.util.ArrayList;
import java.util.List;

public class AttendanceLog {
    private List<Student> studentList = new ArrayList<>();


    //학생추가
//upsert
    public void updateStudent(String name, String date) {
        boolean isExist = false;
        Student std = new Student(name, date);
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getName().equals(name)) {
                isExist = true;
                studentList.set(i, std);
                System.out.println(date + "으로 " + name + "의 출석날짜가 업데이트 되었습니다.");

            }
        }
        if(isExist==false){
            studentList.add(std);
        }

        System.out.println(studentList.size());
    }


    //마지막 출석 날짜 출력하기
    public void getLastAttendance(String name) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getName().equals(name)) {
                System.out.println(name + "마지막 출석일: " + studentList.get(i).getAttendanceDate());
            }
        }
    }

}

package oct25;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnotherAttendanceProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();
        boolean isRunnable = true;
        while(isRunnable){
            String userInput = sc.nextLine();
            //"홍길동 2023-10-16"
            //"홍길동"
            //"홍길동 2023-10-26"
            if(userInput.length()<4){
                //이름만 입력->조회하기
                for(int i =0; i<studentList.size(); i++){
                    if(userInput.substring(0,3).equals(studentList.get(i).getName())){
                        System.out.println(studentList.get(i).getName());
                        System.out.println(studentList.get(i).getDate());
                    }
                }
            }else{
                //"이름 yyyy-MM-dd"
                //새로운 학생인지 아닌지
                String userInputName = userInput.substring(0,3);
                String userInputDate = userInput.substring(4,8)+userInput.substring(9,11)+userInput.substring(12);
                //여기에 객체를 만들면 for문이 돌아도 영향을 받지않겠지?
                //수정을 위한 객체와 새로운 학생을 위한 객체가 하나의 객체에서 초기화되도되나?
                Student student = new Student();
                student.setName(userInputName);
                student.setDate(userInputDate);
                //하나의 객체로 수정과 추가를 ?

                String type = "";
                int index = 0;
                
                for(int i =0; i<studentList.size(); i++){
                    //여기에 객체를 만들면 i가 증가할때마다 객체가 추가됨
                    if(userInputName.equals(studentList.get(i).getName())){
                        type = "Edit";
                        index = i;
                    }else{
                        type = "Add";
                    }
                }

                if(type.equals("Edit")){
                    studentList.get(index).setDate(userInputDate);
                }else if(type.equals("Add")){
                    studentList.add(student);
                }
            }
        }
    }
}

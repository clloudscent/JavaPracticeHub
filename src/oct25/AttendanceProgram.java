package oct25;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AttendanceProgram {
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
                if(studentList.size()==0){
                    System.out.println("첫 학생");
                    Student std = new Student();
                    std.setName(userInput.substring(0,3));
                    std.setDate((userInput.substring(4,8)+userInput.substring(9,11)+userInput.substring(12)));
                    studentList.add(std);
                    continue;
                }
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
                for(int i =0; i<studentList.size(); i++){
                    //여기에 객체를 만들면 i가 증가할때마다 객체가 추가됨
                    if(userInputName.equals(studentList.get(i).getName())){
                        //사용자가 입력한 이름이 리스트에 담겨있다!
                        //리스트에 담겨있는 객체를 가져와서 수정하거나, 리스트가 담겨있는 인덱스에 객체를 넣자
                        //객체를 새로만들어서 해당 i번째 인덱스에 넣어도 상관없나?
                        //하나의 객체를 활용해야하므로 해당 객체에 수정할 학생정보를 넣자
                        //student.setName(userInputName);
                        //student.setDate(userInputDate);
                        //현재 student 객체에 사용자가 입력한 이름과 날짜가 담겨있지만 리스트에는 아직 담겨있지않아
                        //for문이 종료된다음 리스트에 넣어주면??
                        //이미 리스트에 담겨있는 학생이 수정되는게 아니라 새로운 학생으로 등록되나?
                        //리스트에는 이미 "홍길동 2023-10-16"이 담겨있어
                        //그러므로 담기전에 이미 리스트에 담겨있는 정보를 지워버리자(?)이 if문은 이미 학생정보가 담겨있을 때만 실행되니까
                        //지우면 홍길동이라는 학생정보는 더이상 리스트에 없어
                        studentList.remove(i);

                    }else{
                        //사용자가 입력한 이름이 리스트에 담겨있지 않다,,
                        //새로운 학생이다
                        //새로운 학생이니까 객체를 새로 만들어서 리스트에 새로넣자->여기서 객체를 리스트에 넣으면 for문이 돌면서 사용자가 입력한 이름이 리스트에 담겨있다고 판단함
                        //그럼 객체를 밖에서 만들어야하나
                        //객체 생성위치는?
                        //student.setName(userInputName);
                        //student.setDate(userInputDate);
                        //setName과 setDate가 if와 else문에 중복되어 실행되고있다
                    }

                }
                studentList.add(student);
            }
        }
    }
}

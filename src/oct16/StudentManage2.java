package oct16;

import java.util.Scanner;


public class StudentManage2 {
    public static void main(String[] args) {
        AttendanceLog log = new AttendanceLog();
        Scanner sc = new Scanner(System.in);
        boolean isRunnable = true;

        while(isRunnable){
            System.out.println("입력: ");
            String inputString = sc.nextLine();
            if(inputString.contains("-")){
                String name = inputString.substring(0,3);
                String date = inputString.substring(3);
                log.updateStudent(name, date);
            }else{
                log.getLastAttendance(inputString);
            }

        }
    }
}

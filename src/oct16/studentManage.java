package oct16;

import java.util.ArrayList;
import java.util.Scanner;


public class studentManage {
    public static void main(String[] args) {
        AttendanceLog log = new AttendanceLog();
        int inputNum = 0;
        boolean isRunnable = true;
        Scanner sc = new Scanner(System.in);

        while (isRunnable) {
            System.out.println("1. 학생정보입력하기 \n" +
                    "2. 수정하기\n" +
                    "3. 정보확인하기\n"+
                    "4. 종료");
            inputNum = sc.nextInt();
            sc.nextLine();
            switch (inputNum) {
                case 1:
                    System.out.println("학생정보입력하기");
                    System.out.print("이름: ");
                    String name = sc.nextLine();
                    System.out.print("출석일: ");
                    String date = sc.nextLine();
                    /*log.addStudent(name, date);*/
                    break;

                case 2:
                    System.out.println("2. 학생정보 수정하기");
                    System.out.print("이름: ");
                    String updatedName = sc.nextLine();
                    System.out.print("출석일: ");
                    String updatedDate = sc.nextLine();
                    /*log.update(updatedName, updatedDate);*/
                    break;

                case 3:
                    System.out.println("2. 학생정보 확인하기");
                    System.out.print("이름: ");
                    String checkName = sc.nextLine();
                    log.getLastAttendance(checkName);
                    break;

                case 4:
                    System.out.println("종료");
                    isRunnable = false;
                    break;

            }

        }

    }
}

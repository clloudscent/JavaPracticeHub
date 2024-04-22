package oct24;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentLog {
    public static void main(String[] args) {
        List<StudentLogInfo> stdInfoList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean isRunnable = true;
        //while문 종료하려면 inputString에 exit 임의로 넣어서 종료
        while (isRunnable) {
            System.out.println("입력:");
            String inputString = sc.nextLine();
            if (inputString.equals("exit")) {
                System.exit(0);
            }
            //홍길동 2023-10-16
            //홍길동
            String name = "";
            String attendanceDate = "";

            int extractedYear = 0;
            int extractedMonth = 0;

            if (inputString.length() < 4) {
                name = inputString.substring(0, 3);
                attendanceDate = null;
            } else {
                name = inputString.substring(0, 3);
                attendanceDate = inputString.substring(3);
                extractedYear = Integer.parseInt(attendanceDate.substring(2, 5));
                extractedMonth = Integer.parseInt(attendanceDate.substring(6, 8));
                int extractedDate = Integer.parseInt(attendanceDate.substring(9));
                System.out.println(attendanceDate);
                System.out.println(extractedYear);
                System.out.println(extractedMonth);
                System.out.println(extractedDate);
            }


            System.out.println(name);

            //리스트에 담겨있지 않은 이름일 경우는 처음 등록하는 사람이므로 새로 등록
            System.out.println("출력:");

            if (stdInfoList.size() == 0) {
                StudentLogInfo stdLogInfo = new StudentLogInfo();
                stdLogInfo.name = name;
                stdLogInfo.attendanceDate = attendanceDate;
                stdInfoList.add(stdLogInfo);
                System.out.println("A");
                System.out.println(attendanceDate + "으로 " + name + "의 출석날짜가 업데이트 되었습니다.");
                continue;
            }


            String updateName = "";
            String updateDate = "";

            for (StudentLogInfo studentInfo : stdInfoList) {
                if (inputString.length() < 4) {
                    System.out.println(studentInfo.name + "의 출석일은 " + studentInfo.attendanceDate + "일 입니다.");
                } else {
                    updateName = name;
                    updateDate = attendanceDate;
                }
            }
            if (inputString.length() > 4) {
                StudentLogInfo stdLogInfo = new StudentLogInfo();
                stdLogInfo.setName(updateName);
                stdLogInfo.setAttendanceDate(updateDate);
//                stdInfoList.set(stdInfoList.get(studentInfo), stdLogInfo);
                System.out.println(attendanceDate + "으로 " + name + "의 출석날짜가 업데이트 되었습니다.");
            }
            //등록되어있는 이름일 경우->날짜도 이미 등록되어있음
            //입력받아온 날짜가 리스트에 등록되어있는 이전일일 경우와 그렇지않은 경우
            //입력받아온 날짜만 리스트와 비교하면됨

            //입력받아온 날짜가 리스트에 등록되어있는 이전일일 경우
            //23-10-16 24-01-02
                /*if ((existedMonth > extractedMonth) || ((existedMonth == extractedMonth) && existedDate > extractedDate)) {
                    System.out.println("기 출석일인 " + studentInfo.attendanceDate + "보다 이전일입니다.");
                } else {*/


            //입력받아온 날짜가 리스트에 등록되어있는 출석일보다 작지 않을 경우 '업데이트 되었습니다'로 새로 넣기


        }
    }
}



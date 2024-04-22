package oct16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentManage3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isRunnable = true;
        Map<String, String> studentMap = new HashMap<>();
        while (isRunnable) {
            System.out.println("입력:");
            String inputString = sc.nextLine();
            String name = inputString.substring(0, 3);
            String date = inputString.substring(3);

            if (!date.contains("-")) {
                System.out.println(name + "의 마지막 출석일은" +
                        studentMap.get(name) + "입니다.");
            } else {
                studentMap.put(name, date);
                System.out.println(studentMap.get(name) + "으로" +
                        name + "의 출석날짜가 업데이트 되었습니다.");
            }
        }
    }
}

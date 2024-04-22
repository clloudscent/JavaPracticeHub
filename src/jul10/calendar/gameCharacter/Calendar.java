package jul10.calendar.gameCharacter;

import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("오늘의 요일을 영어로 입력해주세요: ");
        String userInputDay = sc.nextLine();
        DayOfWeek today = DayOfWeek.valueOf(userInputDay);

        System.out.println("해당 요일의 숫자값은: "+today.intValueOfDay);
        System.out.println("해당 요일의 한글표기는: "+today.koreanValueOfDay);
    }
}

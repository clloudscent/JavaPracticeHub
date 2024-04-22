package jul04;

import java.util.Arrays;
import java.util.Scanner;

public class Practice05 {
    public static void main(String[] args) {
        Week today = Week.TUESDAY;
        String todayString = "TuesDay";

        Scanner sc = new Scanner(System.in);

        System.out.print("근로휴일을 입력해주세요("+ Arrays.toString(Week.values()) +"): ");
        String breakingDay = sc.nextLine();
        Week.valueOf(breakingDay);
        if(today==Week.valueOf(breakingDay)){
            System.out.println("오늘 근로휴일 대상자입니다.");
        }else{
            System.out.println("");
        }

        System.out.println(Toy.brand);


    }
}

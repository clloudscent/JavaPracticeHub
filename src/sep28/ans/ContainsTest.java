package sep28.ans;

import java.util.List;
import java.util.Scanner;

public class ContainsTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력:");
        String inputString = sc.nextLine();
        containsMethodTest(inputString);


    }
    public static void containsMethodTest(String inputString){

        String numString = "7";

        int num = 7;
        //Wrapper
        Integer intNum = num;


        if(inputString.contains(",")||inputString.contains("\n")){
            System.out.println("쉼표 또는 줄바꿈 기호가 포함되어있습니다.");
        }
    }
}

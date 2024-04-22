package jun15;

import java.util.Scanner;

public class num01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        int printNum = userInput / 2 + 1;

        for (int i = 1; i <= printNum; i++) {
            if (i == printNum) {
                for (int j = printNum - 1; j >= 0; j--) {
                    System.out.println(j);
                }
                System.out.println("");
            }else{
                for(int j = 0; j<i; j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
}

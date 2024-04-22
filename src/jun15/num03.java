package jun15;

import java.util.Scanner;

public class num03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        for(int i = 1; i<=inputNum; i++){
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            for(int j = i; j<=2*inputNum-i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

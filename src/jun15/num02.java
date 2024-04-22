package jun15;

import java.util.Scanner;

public class num02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();

        for(int i = 1; i<=inputNum; i++){
            for(int k = inputNum; k>i; k--){
                System.out.print(" ");
            }
            for(int j = 1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

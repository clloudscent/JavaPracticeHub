package jun15;

import java.util.Scanner;

public class num04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();

        for(int i = 1; i<=inputNum; i++){
            //왼쪽 빈칸 출력
            for(int j = inputNum; j>i; j--){
                System.out.print(" ");
            }
            //별
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            //오른쪽빈칸
            for(int j = inputNum; j>i; j--){
                System.out.print("");
            }
            System.out.println(" ");
        }
        for(int i=1; i<inputNum; i++){
            //왼쪽빈칸출력
            for(int j =1; j<=i; j++){
                System.out.print(" ");
            }
            //별
            for(int j = i; j<2*inputNum-i-1; j++){
                System.out.print("*");
            }
            //오른쪽빈칸
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}

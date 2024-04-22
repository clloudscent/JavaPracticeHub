package primeNum;

import java.util.Scanner;

public class TrueOrFalse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputNum = sc.nextInt();

        boolean isPrimeNum = true;

        for(int i =2; i<inputNum; i++){
            if(inputNum%i==0){
                isPrimeNum = false;
            }
        }


        System.out.println(isPrimeNum);
    }
}

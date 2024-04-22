package filePractice;

import java.util.ArrayList;
import java.util.Scanner;

import static primeNum.TrueFalseCheck.isPrime;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자입력해주세요");
        int num = sc.nextInt();

        for (int i = num; i > 1; i--) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}

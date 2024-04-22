package march2;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        int num1=0;
        int num2=0;

        Scanner sc = new Scanner(System.in);

        System.out.print("1번 숫자: ");
        num1 = sc.nextInt();

        System.out.print("2번 숫자: ");
        num2 = sc.nextInt();

        int temp = num1;
        num1 = num2;
        num2 = temp;

    }
}

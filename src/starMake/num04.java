package starMake;

import java.util.Scanner;

public class num04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("줄수입력:");
        int lines = sc.nextInt();
        for (int i = lines; i > 0; i--) {
            for (int j = lines - i; j > 0; j--)
                System.out.print(" ");
            for (int j = 2 * i - 1; j > 0; j--)
                System.out.print("*");
            System.out.println();
        }
    }
}

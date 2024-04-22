package starMake;

import java.util.Scanner;

public class num02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("줄수입력:");
        int lines = sc.nextInt();
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < lines - i; j++)
                System.out.print(" ");
            for (int j = 0; j < 2 * i + 1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}

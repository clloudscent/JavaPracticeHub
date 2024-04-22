package starMake;

import java.util.Scanner;

public class StarPrint2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문제번호입력:");
        int pattern = sc.nextInt();
        System.out.println("줄수입력:");
        int lines = sc.nextInt();

        switch (pattern) {
            case 1:
                for (int i = 0; i < lines; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 0; i < lines; i++) {
                    for (int j = 0; j < lines - i - 1; j++)
                        System.out.print(" ");
                    for (int j = 0; j < 2 * i + 1; j++)
                        System.out.print("*");
                    System.out.println();
                }
                break;
            case 3:
                for (int i = 0; i < lines; i++) {
                    for (int j = 0; j < lines - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 4:
                for (int i = lines; i > 0; i--) {
                    for (int j = lines - i; j > 0; j--)
                        System.out.print(" ");
                    for (int j = 2 * i - 1; j > 0; j--)
                        System.out.print("*");
                    System.out.println();
                }
                break;
            case 5:
                for (int i = 0; i < lines/2; i++) {
                    for (int j = 0; j < lines/2 - i; j++)
                        System.out.print(" ");
                    for (int j = 0; j < 2 * i + 1; j++)
                        System.out.print("*");
                    System.out.println();
                }
                for (int i = lines /2; i >= 0; i--) {
                    for (int j = 0; j < lines/2 - i; j++)
                        System.out.print(" ");
                    for (int j = 0; j < 2 * i + 1; j++)
                        System.out.print("*");
                    System.out.println();
                }
                break;
        }
    }
}


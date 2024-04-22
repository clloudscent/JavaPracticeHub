package Record;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        char temp = 't';

        System.out.println(sum(a,b,c));
    }
    public static int sum(int a, int b, int c){
        int value = a+b+c;
        return value;
    }
}

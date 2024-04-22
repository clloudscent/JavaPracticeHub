package hun13;

import java.util.Scanner;

public class num01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요:");
        int num1 = scanner.nextInt();

        System.out.println("두 번째 숫자를 입력하세요:");
        int num2 = scanner.nextInt();

        /*int temp = num2;
        num2 = num1 % num2;
        num1 = temp;*/

        int biggerNum;
        if(num1>num2){
            biggerNum = num1;
        }else{
            biggerNum = num2;
        }

        int temp = 1;

        for(int i = 1; i<biggerNum; i++){
//            System.out.println(i);
            if(num1%i == 0 && num2%i== 0){
                temp *=i ;

                num1 = num1/i;
                num2 = num2/i;
                biggerNum = biggerNum/i;
                System.out.println(num1);
                System.out.println(num2);

                i = 1;
            }
        }
        System.out.println(temp*num1*num2);
    }

}

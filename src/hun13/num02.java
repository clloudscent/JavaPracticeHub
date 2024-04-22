package hun13;

import java.util.Scanner;

public class num02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요:");
        int num1 = scanner.nextInt();

        System.out.println("두 번째 숫자를 입력하세요:");
        int num2 = scanner.nextInt();

        /*int temp = num2;
        num2 = num1 % num2;
        num1 = temp;*/
        System.out.println("최대공약수: "+getGCM(num1, num2));
        System.out.println("최소공배수: "+getLCM(num1, num2));


//        System.out.println(temp*num1*num2);
    }

    public static int getGCM(int num1, int num2){
        int gcm = num1<num2?num1:num2;

        while(gcm>1){
            if(num1%gcm==0&&num2%gcm==0){
                break;
            }
            gcm--;
        }
        return gcm;
    }

    public static int getLCM(int num1, int num2){
        int initNum;
        if(num1>num2){
            initNum = num1;
        }else{
            initNum = num2;
        }

        for(int i=initNum;true;i++){
            if(i%num1==0&&i%num2==0){
                return i;
            }
        }
    }

}

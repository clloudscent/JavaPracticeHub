package jun20;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  balance = 0;
        int inputNum = 0;
        boolean isRunnable = true;
        while(isRunnable){
            System.out.println("-----------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4. 종료");
            System.out.println("-----------------------------");
            System.out.print("선택>");
            inputNum = sc.nextInt();
            switch (inputNum){
                case 1:
                    //1.예금
                    System.out.print("예금액>");
                    int deposit = sc.nextInt();
                    balance += deposit;

                    break;

                case 2:
                    //2.출금
                    System.out.print("출금액>");
                    int withdraw = sc.nextInt();
                    System.out.println("");
                    if(balance<withdraw){
                        break;
                    }else{
                        balance -= withdraw;
                    }
                    break;

                case 3:
                    //3.잔고
                    System.out.print("잔고>");
                    System.out.println(balance);
                    break;

                case 4:
                    isRunnable = false;
                    System.out.println("프로그램 종료");
            }
            System.out.println("");
        }

    }
}

/*
package exceptionPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Process {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountClass account = new AccountClass();
        List<AccountClass> userList = new ArrayList<>();

        int inputNum = 0;
        boolean isRunnable = true;

        while(isRunnable){
            inputNum = sc.nextInt();
            sc.nextLine();
            switch (inputNum){
                case 1:
                    System.out.println("계좌생성");
                    System.out.print("사용자 ID: ");
                    try{
                        int inputUserId = sc.nextInt();
                        sc.nextLine();
                        AccountClass newAccount = new AccountClass();
                        newAccount.userId = inputUserId;
                        newAccount.accountNumber = userList.add(newAccount);
                    }catch(Exception e){
                        String message = e.getMessage();
                        System.out.println(message);
                    }
                    break;
                case 2:
                    System.out.println("예금하기");
                    System.out.print("계좌번호: ");
                    int inputAccountNum = sc.nextInt();
                    System.out.println("입금액: ");
                    int depositAmount = sc.nextInt();
                    for(int i =0; i<userList.size(); i++){
                        if(inputAccountNum == userList.get(i).accountNumber){
                            account.deposit(depositAmount);
                            System.out.println("입금완료");
                        }else{
                            System.out.println("없는 계좌번호입니다.");
                        }
                    }
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("종료");
                    isRunnable = false;
                    break;
            }
        }
    }
}
*/

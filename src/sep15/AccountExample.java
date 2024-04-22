package sep15;

import java.util.Scanner;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();
        Scanner sc = new Scanner(System.in);
        int inputPassword = 0;


        //예금하기
        try{
            System.out.println("예금하기");
            System.out.print("비밀번호: ");
            inputPassword = sc.nextInt();
            account.getPassword(inputPassword);
            account.deposit(10000);
            System.out.println("예금액: " + account.getBalance());
        }catch (WrongPasswordException e){
            String message = e.getMessage();
            System.out.println(message);
        }



        //출금하기
        try{
            System.out.println("출금하기");
            System.out.print("비밀번호: ");
            inputPassword = sc.nextInt();
            account.getPassword(inputPassword);
            account.withdraw(30000);
        }catch (WrongPasswordException | InsufficientException e){
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}

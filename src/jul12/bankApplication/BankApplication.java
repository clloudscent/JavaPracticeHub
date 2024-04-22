package jul12.bankApplication;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Account[] accountArray = new Account[100];
        Scanner sc = new Scanner(System.in);
        int index = 0;
        String inputNum = "";
        boolean isRunnable = true;

        while (isRunnable) {
            System.out.println("------------------------------------");
            System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
            System.out.println("------------------------------------");
            System.out.print("선택>");
            inputNum = sc.nextLine();

            switch (inputNum) {
                case "1":
                    Account account = new Account();
                    System.out.println("-------");
                    System.out.println("계좌생성");
                    System.out.println("-------");
                    System.out.print("계좌변호: ");
                    String accountNum = sc.nextLine();
                    account.setAccountNumber(accountNum);
                    System.out.print("계좌주: ");
                    String owner = sc.nextLine();
                    account.setAccountOwner(owner);
                    System.out.print("초기비밀번호설정: ");
                    String password = sc.nextLine();
                    account.setPassword(password);
                    System.out.print("초기입금액: ");
                    int initialDeposit = Integer.parseInt(sc.nextLine());
                    account.setBalance(initialDeposit);
                    System.out.println("계좌가 생성되었습니다.");
                    accountArray[index++] = account;
                    break;

                case "2":
                    System.out.println("-------");
                    System.out.println("계좌목록");
                    System.out.println("-------");

                    for (int i = 0; i < index; i++) {
                        System.out.print(accountArray[i].getAccountNumber() + "  ");
                        System.out.print(accountArray[i].getAccountOwner() + "  ");
                        System.out.println(accountArray[i].getBalance());
                    }
                    break;

                case "3":
                    System.out.println("-------");
                    System.out.println("예금");
                    System.out.println("-------");
                    System.out.print("계좌번호: ");
                    String currentAccountNum = sc.nextLine();
                    System.out.print("비밀번호: ");
                    String passwordCheck = sc.nextLine();
                    for (int i = 0; i < index; i++) {
                        if (accountArray[i].getPassword().equals(passwordCheck)) {
                            System.out.print("예금액: ");
                            int deposit = Integer.parseInt(sc.nextLine());
                            if (currentAccountNum.equals(accountArray[i].getAccountNumber())) {
                                accountArray[i].setBalance(accountArray[i].getBalance() + deposit);
                            }
                        }else{
                            System.out.println("비밀번호가 일치하지 않습니다.");
                        }
                    }
                    break;

                case "4":
                    System.out.println("-------");
                    System.out.println("출금");
                    System.out.println("-------");
                    System.out.print("계좌번호: ");
                    String accountForWithdraw = sc.nextLine();
                    System.out.print("비밀번호: ");
                    String passwordCheck2 = sc.nextLine();
                    for (int i = 0; i < index; i++) {
                        if (accountForWithdraw.equals(accountArray[i].getAccountNumber())) {
                            if (accountArray[i].getPassword().equals(passwordCheck2)) {
                                System.out.print("출금액: ");
                                int withdrawAmount = Integer.parseInt(sc.nextLine());
                                if (accountForWithdraw.equals(accountArray[i].getAccountNumber())) {
                                    if (withdrawAmount > accountArray[i].getBalance()) {
                                        System.out.println("출금할 수 없습니다.");
                                        break;
                                    }
                                    accountArray[i].setBalance(accountArray[i].getBalance() - withdrawAmount);
                                    System.out.println("결과: 출금이 성공되었습니다.");
                                }
                            }else{
                                System.out.println("비밀번호가 일치하지않습니다.");
                                break;
                            }
                        }
                    }
                    break;

                case "5":
                    System.out.println("프로그램 종료");
                    System.exit(0);
            }
        }
    }
}

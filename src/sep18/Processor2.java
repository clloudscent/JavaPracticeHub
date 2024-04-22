package sep18;

import aug07.A;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Processor2 {
    public static void main(String[] args) throws WrongAccountException, WrongPasswordException, InsufficientException {
        Scanner sc = new Scanner(System.in);
        List<Account> accounts = new ArrayList<>();
        boolean isRunnable = true;
        while (isRunnable) {
            System.out.println("" +
                    "1. 계좌생성" +
                    "2. 입금" +
                    "3. 출금" +
                    "4. 종료");
            int inputNum = sc.nextInt();
            sc.nextLine();
            switch (inputNum) {
                case 1:
                    System.out.print("User ID: ");
                    int userId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Password: ");
                    String password = sc.nextLine();

                    try {
                        checkIDDuplication(accounts, userId, password);
                    }catch (DuplicationIdException e){
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.print("Account Number: ");
                    int accountId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Amount: ");
                    int amount = sc.nextInt();
                    sc.nextLine();

                    boolean found = false;
                    for (int i = 0; i < accounts.size(); i++) {
                        if (accounts.get(i).userId == accountId) {
                            accounts.get(i).deposit(amount);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        throw new WrongAccountException("Wrong account number");
                    }

                    break;

                case 3:
                    System.out.print("Account Number: ");
                    int withdrawAccountId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Password: ");
                    String withdrawPassword = sc.nextLine();

                    for (int i = 0; i < accounts.size(); i++) {
                        if (accounts.get(i).userId == withdrawAccountId) {
                            if (!accounts.get(i).password.equals(withdrawPassword)) {
                                throw new WrongPasswordException();
                            }
                            System.out.print("Amount: ");
                            int withdrawAmount = sc.nextInt();
                            sc.nextLine();
                            accounts.get(i).withdraw(withdrawAmount);
                        }
                    }
                    break;

                case 4:
                    System.out.println("시스템 종료");
                    isRunnable = false;
                    break;
            }
        }
    }
    public static void checkIDDuplication(List<Account> accounts, int userId, String password)throws DuplicationIdException{
        boolean exists = false;
        for (int i = 0; i < accounts.size(); i++) {

                if (accounts.get(i).userId == userId) {
                    throw new DuplicationIdException("This ID already exists");
                }else{
                    exists = true;
                }

        }
        if (!exists) {
            accounts.add(new Account(userId, password));
        }
    }
}

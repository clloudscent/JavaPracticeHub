package assignment;

public class BankAccountProcess {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456");

        account.deposit(1000);
        System.out.println("계좌 잔액: " + account.getBalance());

        boolean isWithdrawn = account.withdraw(500);
        if (isWithdrawn) {
            System.out.println("출금 성공. 계좌 잔액: " + account.getBalance());
        } else {
            System.out.println("출금 실패. 계좌 잔액: " + account.getBalance());
        }

        isWithdrawn = account.withdraw(1000);
        if (isWithdrawn) {
            System.out.println("출금 성공. 계좌 잔액: " + account.getBalance());
        } else {
            System.out.println("출금 실패. 계좌 잔액: " + account.getBalance());
        }
    }
}

package sep18;

public class Account {
    int userId;
    int balance;
    String password;

    public Account(int userId, String password) {
        this.userId = userId;
        this.password = password;
        this.balance = 0;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) throws InsufficientException {
        if (this.balance < amount) {
            throw new InsufficientException();
        }
        this.balance -= amount;
    }
}

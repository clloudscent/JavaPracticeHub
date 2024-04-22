package jul14.bankApplication;

public class Account {
    private String accountNumber;
    private String accountOwner;
    private int balance;
    private String password;

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public String getAccountOwner(){
        return accountOwner;
    }
    public void setAccountOwner(String accountOwner){
        this.accountOwner = accountOwner;
    }
    public int getBalance(){
        return balance;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountOwner='" + accountOwner + '\'' +
                ", balance=" + balance +
                ", password='" + password + '\'' +
                '}';
    }
}

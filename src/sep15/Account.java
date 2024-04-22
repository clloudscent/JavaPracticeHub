package sep15;

public class Account {
    private long balance;
    private int password = 1234;


    public Account(){}

    public long getBalance(){
        return balance;
    }

    public void deposit(int money){
        balance += money;
    }
    public void withdraw(int money) throws InsufficientException{
        if(balance < money){
            throw new InsufficientException("잔고부족:"+(money-balance)+"모자람");
        }
        balance -= money;
    }

    public void getPassword(int inputPassword) throws WrongPasswordException{
        if(inputPassword != password){
            throw new WrongPasswordException("비밀번호 잘못입력");
        }
    }
}

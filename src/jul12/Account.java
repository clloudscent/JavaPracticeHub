package jul12;

public class Account {

    static final int MIN_BALANCE = 0;
    static final int MAX_BALANCE = 1000000;
    private int balance;

    public void setBalance(int balance) {
        //x는 0보다 작으면서 100만보다 커야한다.
//        if(!(0<=x) && !(x<1000000)){
        //x는 0보다 크거나 같으면서 100만보다 작거나 같은 경우.
        if (MIN_BALANCE <= balance && balance <= MAX_BALANCE) {
            this.balance = balance;
        }
    }
    public int getBalance(){
        return balance;
    }

}

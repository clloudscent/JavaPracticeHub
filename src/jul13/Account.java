package jul13;

public class Account {
    //외부에서 객체 생성 없이 만들어진 객체를 읽어들일 수 있또록 static필드로 해당 클래스의 객체를 미리 담아둠.
    private static Account singleton = new Account();
    //외부에서 객체를 직접 생성하는 걸 막기 위해서 private 접근제한자의 생성자만 선언.
    private Account(){}

    public static Account getInstance(){
        return singleton;
    }

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
}

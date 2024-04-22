package jul13;

public class Calculator {
    private static Calculator singleton = new Calculator();
    private Calculator(){}

    public static Calculator getInstance(){
        return singleton;
    }


    public int sum(int num1, int num2){
        return num1+num2;
    }

    public int minus(int num1, int num2){
        return num1-num2;
    }
}

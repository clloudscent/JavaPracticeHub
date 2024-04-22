package jul14;

public class Calculator {
    private static Calculator singleton = new Calculator();

    //생성자는 리턴타입이 없고, 이름을 클래스 이름으로 선언한다.
    private Calculator(){};

    public static Calculator getInstance(){return singleton;}

    int plus(int a, int b){return a+b;}
}

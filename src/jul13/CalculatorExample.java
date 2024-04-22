package jul13;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator calc1 = Calculator.getInstance();
        Calculator calc2 = Calculator.getInstance();

        int result = calc1.sum(5, 10);
        System.out.println(result);

        result = calc2.minus(30, 6);
        System.out.println(result);

        Calculator calc3 = Calculator.getInstance();

        result = calc3.sum(10, 5);
        System.out.println(result);
    }
}

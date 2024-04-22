package jul6;

public class Person {
    int numNowThinking;
    Calculator myCalculator = new Calculator();

    public void calculateSummation(int num1, int num2){
        this.numNowThinking = myCalculator.sum(num1, num2);
    }



}

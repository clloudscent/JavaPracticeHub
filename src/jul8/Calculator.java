package jul8;

public class Calculator {
    final Double pi = 3.141592;
    String color;


    public double getCircleArea(double r){
        return pi*Math.pow(r, 2);
    }

    void setColor(String color){
        this.color=color;
    }

    public static int sum(int num1, int num2){
        return num1+num2;
    }
}

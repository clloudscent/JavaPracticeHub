package jul26;

public class Car {
    private static String brand = "HYUNDAI";
    private int currentSpeed;
    public void accel(){
        currentSpeed++;
        System.out.println("자동차를 가속합니다. 현재속도: "+currentSpeed);
    }

    public static void printBrand(){
        System.out.println("자동차의 제조사는 "+brand+"입니다.");
    }
}

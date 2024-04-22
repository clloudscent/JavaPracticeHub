package jul8;

public class Car {
    int gas;
    int speed;

    static String brand;

    public static void printMachineType(){
        System.out.println("이 기계는 자동차 입니다.");
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public int getGas(){
        return this.gas;
    }
}

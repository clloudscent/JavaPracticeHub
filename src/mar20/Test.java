package mar20;

public class Test {
    public static void main(String[] args) {
        Car car =new Car(4,"V8TURBO",4,5);
        MotorCycle motorCycle = new MotorCycle(2,"TURBO");
        car.display();
        motorCycle.display();
    }
}

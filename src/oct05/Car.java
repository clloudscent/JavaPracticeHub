package oct05;

public class Car extends Vehicle{
    int doorCount;
    public Car(int speed, String color, int doorCount){
        super(speed, color);
        this.doorCount = doorCount;
    }
}

package oct05;

public class Bike extends Vehicle{
    boolean hasPedal;

    public Bike(int speed, String color, boolean hasPedal){
        super(speed, color);
        this.hasPedal = hasPedal;
    }
}

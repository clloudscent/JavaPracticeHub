package mar20;

public class MotorCycle extends Vehicle{
    public int getSeatingCapacity(){
        return 1;
    }

    MotorCycle(int numberOfWheels, String engineName) {
        super(numberOfWheels, engineName);
    }

    @Override
    void display() {
        System.out.println("MotorCycle");
        System.out.println("Wheels: " + numberOfWheels);
        System.out.println("SeatingCapacity: "+ getSeatingCapacity());
        System.out.println("EngineName: " + engineName);
    }
}

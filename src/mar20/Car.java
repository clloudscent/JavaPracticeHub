package mar20;

public class Car extends Vehicle{
    int numberOfDoors;
    int seatingCapacity;

    Car(int numberOfWheels, String engineName, int numberOfDoors, int seatingCapacity) {
        super(numberOfWheels, engineName);
        this.numberOfDoors = numberOfDoors;
        this.seatingCapacity =seatingCapacity;
    }

    @Override
    void display() {
        System.out.println("Car");
        System.out.println("Wheels: " + numberOfWheels);
        System.out.println("Doors: " + numberOfDoors);
        System.out.println("SeatingCapacity: "+ seatingCapacity);
        System.out.println("EngineName: " + engineName);
    }
}

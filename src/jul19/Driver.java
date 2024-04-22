package jul19;

public class Driver {
    public void drive(Vehicle vehicle){
        // +, /, -, *, &&, instanceof
        if(vehicle instanceof Taxi){
            System.out.println("택시를 운전합니다.");
        }
        vehicle.run();
    }
}

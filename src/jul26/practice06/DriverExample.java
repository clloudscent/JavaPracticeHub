package jul26.practice06;

import jul26.RemoteControl;

import java.rmi.Remote;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus);
        driver.drive(taxi);

//        Taxi taxi2 = new Bus();
//        RemoteControl remoteControl = new Bus();

//        Bus bus = new RemoteControl();

        Vehicle vehicle = new Bus();


    }
}

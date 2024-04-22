package jul20;

public class DrvierExample {
    public static void main(String[] args) {
        //Drvier객체 생성
        Driver driver = new Driver();

        //매개값으로 Bus 객체를 제공하고 driver() 메소드 호출
        Bus bus = new Bus();
        driver.drive(bus);

        Taxi taxi = new Taxi("test");
        driver.drive(taxi);


        Vehicle vehicle = new Vehicle();

//        Car car = new Car();
        driver.drive(vehicle);
    }
}

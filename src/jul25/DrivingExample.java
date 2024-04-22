package jul25;

public class DrivingExample {
    public static void main(String[] args) {
        Driver driver = new Driver();
        GV80 gv80 = new GV80();
        driver.drive(gv80);

        Sonata sonata = new Sonata();
        driver.drive(sonata);



    }
}

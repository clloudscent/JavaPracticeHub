package aug07;

public class Car {
    String brand;
    double price;

    Tire[] tires = new Tire[4];

    class Tire {
        String brand;
        double frictionCoefficient;
    }
}

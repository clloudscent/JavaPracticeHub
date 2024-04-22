package jul26.practice05;

import jul23.num12.C;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.run();

        myCar.tire1 = new KumhoTire();
        myCar.tire2 = new KumhoTire();

        myCar.run();

        Tire[] tireArray = new Tire[5];

        tireArray[0] = new KumhoTire();
        tireArray[1] = new HankookTire();
    }
}

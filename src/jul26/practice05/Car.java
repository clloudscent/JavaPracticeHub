package jul26.practice05;

public class Car {
    Tire tire1 = new HankookTire();
    Tire tire2 = new KumhoTire();

    void run(){
        tire1.roll();
        tire2.roll();
    }
}

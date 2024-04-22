package aug02.practice02;

public class Vehicle {
    protected String brand;

    Vehicle(String brand){
        this.brand = brand;
    }

    void printDetails(){
        System.out.println("This is a vehicle of brand: "+ brand);
    }
}

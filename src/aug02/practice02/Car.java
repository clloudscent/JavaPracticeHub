package aug02.practice02;

public class Car extends Vehicle{
    private String model;

    Car(String brand, String model){
        super(brand);
        this.model = model;
    }
    @Override
    void printDetails(){
        super.printDetails();
        System.out.println("This car's model is: "+ model);
    }
}

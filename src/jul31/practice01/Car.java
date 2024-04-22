package jul31.practice01;

public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    Car(){
//        this("제네시스", "은색", 250);
//        this();
//        this("제네시스");

    }

    Car(String model){
        this.model = model;
    }

    Car(String model, String color){
        this.model = model;
        this.color = color;
    }

    Car(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}

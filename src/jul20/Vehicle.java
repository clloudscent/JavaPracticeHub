package jul20;

public class Vehicle {
    String modelNo;

    //메소드선언
    public void run() {
        System.out.println("차량이 달립니다.");
    }

    Vehicle(){

    }
    Vehicle(String modelNo) {
        this.modelNo = modelNo;
    }
}

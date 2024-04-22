package thisIsJava.ch06;

public class CarExample3 {
    public static void main(String[] args) {
        Car3 car1 = new Car3();
        System.out.println("car1.company"+car1.company);
        System.out.println();
        Car3 car2 = new Car3("자가용");
        System.out.println("car3.company"+car2.company);
        System.out.println("car3.model"+car2.model);
    }
}

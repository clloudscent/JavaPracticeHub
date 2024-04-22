package aug21.buttonExample;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        car.run1();

        car.run2();

        Tire tire = new Tire(){
            @Override
            public void roll(){
                System.out.println("익명 자식 Tire 객체가 굴러갑니다.");
            }
        };

        car.run3(new Tire(){
            @Override
            public void roll(){
                System.out.println("익명 자식 Tire 객체가 굴러갑니다.");
            }
        });
    }

}

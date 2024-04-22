package jul20;

public class Driver {
    //메소드 선언(클래스타입의 매개변수를 가지고 있음)
    public void drive(Vehicle vehicle){
        if(vehicle instanceof Bus){
            //형변환 연산자(cast)
            //(바꾸고자하는 자료형)바뀔 대상값
            Bus bus = (Bus)vehicle;
            System.out.println("요 버스는 "+bus.capacity+"인승 입니다.");
            //+, -, *, / , %
            //==, !=, <, >, <=, >=
            //&&, ||, !
            //=, +=, -=, *=
            //&,|,^
            //instanceof
        }
        vehicle.run();
    }
}

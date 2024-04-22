package jul23;

public class PhoneExample {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("홍길동");
//        SmartPhone smartPhone = new SmartPhone();

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();

//        Phone phone = new Phone("홍길동");
//        phone.turnOn();
//        phone.turnOff();

    }
}

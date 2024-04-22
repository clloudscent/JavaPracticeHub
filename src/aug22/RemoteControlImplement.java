package aug22;

public class RemoteControlImplement implements RemoteControl{
    @Override
    public void turnOn() {
        System.out.println("에어컨을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("에어컨을 끕니다.");
    }
}

package jul25;

import jul11.getterSetter.A;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Television();
        rc.turnOn();

//        Television tv = new Television();
//        tv.turnOn();

        rc = new Audio();
        rc.turnOn();

//        Audio audio = new Audio();
//        audio.turnOn();
    }
}

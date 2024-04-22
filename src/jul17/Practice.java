package jul17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        int intNum = 10;
        double doubleNum = intNum;

        byte byteNum = (byte)intNum;

        Animal animal = new Cat();
        Thing thing = new Cat();

        Object obj = new Cat();

        thing = new Clover();

//        SmartPhone smartPhone = new SmartPhone("갤럭시", "블랙");
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.bell();

        Phone phone = smartPhone;
        phone.bell();



        List<String> list2 = new ArrayList<>();

        list2 = new LinkedList<>();
        list2.add("apple");








    }
}

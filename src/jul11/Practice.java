package jul11;

import jul11.human.Korean;

public class Practice {
    public static void main(String[] args) {
        Korean korean = new Korean();
        System.out.println(korean.nation);

        String nation = "한국";
        korean.nation = "대ㅑ헞대ㅑㄹ";

        Computer com = Computer.getInstance();
//        Computer com2 = new Computer();

    }
}

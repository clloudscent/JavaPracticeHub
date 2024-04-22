package pkg20231127;

public class Practice01 {
    public static void main(String[] args) {
        int intNum =7;
        short shortNum = 5;

        intNum = shortNum;

        shortNum = (short)intNum;

        byte byteNum = -128;
        byteNum--;

        System.out.println(byteNum);
    }
}

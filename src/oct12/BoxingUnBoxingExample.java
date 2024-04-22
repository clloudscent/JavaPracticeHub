package oct12;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        Integer obj = 100;
        System.out.println("value: " + obj.intValue());

        //unboxing
        int value = obj;
        System.out.println("value: " + value);

        //연산 시 unboxing
        int result = obj + 100;
        System.out.println("result: " + result);

        int num= 7;
        Integer num2 = 50;

        int num4 = num2;
    }

}

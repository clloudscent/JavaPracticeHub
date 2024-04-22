package oct12;

public class WrapperPractice {
    public static void main(String[] args) {

        Integer intNum = 5000;
        Integer intNum2 = new Integer(5000);

        System.out.println(intNum.equals(intNum2));


        Student std = new Student().id("1").name("홍길동");
        Student std2 = new Student().id("1").name("홍길동");

        System.out.println(std==std2);

        int num1 = 5000;
        int num2 = 5000;
        System.out.println(num1==num2);





    }
}

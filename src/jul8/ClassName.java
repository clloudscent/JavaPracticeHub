package jul8;

public class ClassName {

    static int field2=5;
    static void method2(){
        System.out.println("나 만들어졌어요");
    }

    static{
        field2 = 10;
        method2();
    }
}

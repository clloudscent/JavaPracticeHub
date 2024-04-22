package jul11.getterSetter;

public class B {
    public void method(){
        A a = new A();

        a.field1 = 1;
        a.field2 =1;
        //a.field3 = 1;

        a.method1();
        a.method2();
        //a.method3();

        //기본값, 명시적 초기화, 생성자를 통한 초기화
    }
}

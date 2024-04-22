package jul17.practice02;

import jul17.practice01.A;

public class D extends A {
    private D d;

    public D(){
        super();
    }

    public void method1(){
        this.field = "value";
        this.method();
    }

    public void method2(){
//        A a = new A();
//        a.field = "value";
//        a.method();
    }
}

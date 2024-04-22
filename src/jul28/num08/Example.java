package jul28.num08;

public class Example {
    public static void action(A a){
        a.method1();
        if(a instanceof C){
//            C c = new C();
            C c = (C) a;
            c.method2();
        }
    }

    public static void main(String[] args) {
        action(new B());
        action(new C());
    }
}

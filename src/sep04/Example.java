package sep04;

public class Example {
    public static void action(A a){
        a.method1();
        //instanceof
        if(a instanceof C){
            C c = (C)a;
            c.method2();
        }
    }

    public static void main(String[] args) {
        action(new A());
        action(new B());
        action(new C());
    }
}

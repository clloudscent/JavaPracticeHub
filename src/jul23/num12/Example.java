package jul23.num12;

public class Example extends Object{
    public static void action(A a){
        a.method1();
        if(a instanceof C){
            C c = (C)a;
            c.method2();
        }
    }

    public static void main(String[] args){
        action(new A());
        action(new B());
        action(new C());
    }

    Example (){
        super();
    }
}

package jul31;

public class MethodPractice {
    public static void main(String[] args) {
        a();
    }

    public static void a(){
        b();
        System.out.println("a() called");
    }

    public static void b(){
        c();
        System.out.println("b() called");
    }

    public static void c(){
        d();
        System.out.println("c() called");
    }

    public static void d(){
        System.out.println("d() called");
    }
}

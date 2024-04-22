package jul18;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();

        Parent parent = child;

//        parent = new Parent();

        parent.method1();
        parent.method2();
        //parent.method3();
    }
}

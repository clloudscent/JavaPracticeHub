package jul18;

public class Practice {
    public static void main(String[] args) {

        Parent parent = new Child();
//        parent = new SecondChild();
        parent.method1();
        parent.method2();


        Child child = (Child)parent;
        child.method1();
        child.method2();
        child.method3();



    }
}

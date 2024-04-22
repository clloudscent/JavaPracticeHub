package jul26.practice06;

public class ParentExample {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        Parent parent = child;
        parent.parentMethod();

    }
}

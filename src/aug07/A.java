package aug07;

public class A {
    String field = "A-field";

    void method(){
        System.out.println("A-method");
    }

    void useB(){
        B b = new B();
        b.print();
    }

    class B{
        String field = "B-field";

        void method(){
            System.out.println("B-method");
        }

        void print(){
            System.out.println(this.field);
            this.method();

            System.out.println(A.this.field);
            A.this.method();
        }
    }


}

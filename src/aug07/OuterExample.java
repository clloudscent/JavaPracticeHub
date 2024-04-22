package aug07;

public class OuterExample {
    public static void main(String[] args) {
        Outer.StaticInner si = new Outer.StaticInner();

        Outer outer = new Outer();
        //인스턴스 멤버 클래스의 객체 생성 시점
        //...


    }
}

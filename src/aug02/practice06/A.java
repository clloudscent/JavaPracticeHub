package aug02.practice06;

public class A {
    //정적 멤버 클래스
    static class B{
        int field1 = 1;

        //생성자
        B(){
            System.out.println("B-생성자 실행");
        }

        //인스턴스 메소드
        void method1(){
            System.out.println("B-method1 실행");
        }
    }
}

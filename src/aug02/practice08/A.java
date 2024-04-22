package aug02.practice08;

import org.w3c.dom.ls.LSOutput;

public class A {
    //메소드
    void useB(){
        //로컬 클래스
        class B{
            //인스턴스 필드
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
        //로컬 객체 생성
        B b = new B();

        //로컬 객체의 인스턴스 필드와 메소드 사용
        System.out.println(b.field1);
        b.method1();

    }

}
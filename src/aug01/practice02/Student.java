package aug01.practice02;

public class Student extends Person{
    String major;
    Student(){
        this("컴퓨터공학과","홍길동",21);

    }
    Student(String major, String name, int age){
        super(name, age);
        this.major = major;
    }
}

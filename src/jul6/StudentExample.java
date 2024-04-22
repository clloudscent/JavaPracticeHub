package jul6;

public class StudentExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "홍길동";
        s1.studentId = "1";
        s1.age = 20;
        System.out.println("s1 변수가 Student 객체를 참조합니다.");
        Student s2 = new Student("2", "임꺽정", 23);
        System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");

        System.out.println("s2 name: "+s2.name);
    }
}

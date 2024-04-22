package daoPractice;

public class MethodPractice {
    static StudentFactory studentFactory = new StudentFactory();

    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = studentFactory.makeStudent();
        student.name = "홍길동";
        student2.name = "임꺽정";
        student.introduce();
        student2.introduce();
    }
}

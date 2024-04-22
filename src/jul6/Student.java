package jul6;

public class Student {
    int age;
    String name;
    String studentId;


    public Student() {
        int grade = 6;
    }

    public Student(String studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;

    }


    public void introduce(){
        int temp;
        /*System.out.println(temp);*/

        int grade = age-19;
        System.out.println("안녕하세요. 저는 올해 "+age+"살이고, 학년은"+grade+"입니다. 제 이름은 "+name+"입니다.");
    }
}

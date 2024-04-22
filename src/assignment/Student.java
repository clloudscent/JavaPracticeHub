package assignment;

public class Student {

    final static String SCHOOL_NAME = "리라초등학교";
    final double PI = 3.14;

    private String name;
    private int age;
    private int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public Student(){

    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getInfo() {
        introduce();
        return "이름: " + name + ", 나이: " + age + ", 학년: " + grade;
    }

    public String introduce(){
        String comment = "안녕하세요. 저는 "+name+"입니다.\n 저는 "+age+"살 이고, "+grade+"학년 입니다.";
        getInfo();
        return comment;
    }

    public Student changeName(String name){
        this.name = name;
        return this;
    }
}

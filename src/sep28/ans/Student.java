package sep28.ans;

public class Student {
    private String name;
    private String studentCode;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Student(String name, String studentCode, String age) {
        this.name = name;
        this.studentCode = studentCode;
        this.age = age;
    }

    @Override
    public String toString() {
        return "\t이름: "+name+"\n\t학번: "+studentCode+"\n\t나이: "+age;
    }
}

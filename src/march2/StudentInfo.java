package march2;

public class StudentInfo {
    int num;
    String name;

    void setNum(int num){this.num = num;}
    void setName(String name){this.name = name;}

    @Override
    public String toString() {
        return "StudentInfo{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }
}

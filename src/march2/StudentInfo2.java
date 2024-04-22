package march2;

public class StudentInfo2 {
    private int number;
    private String name;

    public void setName(String name){this.name = name;}
    public void setNumber(int number){this.number = number;}

    public int getNumber(){return number;}
    public String getName(){return name;}

    @Override
    public String toString() {
        return "StudentInfo2{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}

package oct12;

public class Student {
    private String id;
    private String name;
    private String age;
    private String major;
    private String address;

    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getAge(){
        return age;
    }
    public String getMajor(){
        return major;
    }
    public String getAddress(){
        return address;
    }
    public void setId(String id){
        this.id = id;
    }

    public Student id(String id){
        this.id = id;
        return this;
    }

    public void setName(String name){
        this.name = name;
    }

    public Student name(String name){
        this.name = name;
        return this;
    }

    public void setAge(String age){
        this.age = age;
    }

    public Student age(String age){
        this.age = age;
        return this;
    }
    public void setMajor(String major){
        this.major = major;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public Student address(String address){
        this.address = address;
        return this;
    }

    public Student major(String major){
        this.major = major;
        return this;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", major='" + major + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public Student(){}

    public Student(String id, String name){
        this.id = id;
        this.name = name;
    }

}

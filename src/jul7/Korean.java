package jul7;

public class Korean {
    String nation=  "대한민국";
    String name;
    String ssn;

    int age;

    public Korean(String name, String ssn){
        this.name = name;
        this.ssn = ssn;
    }

    public Korean(String name, String ssn, String nation){
        this.name = name;
        this.ssn = ssn;
        this.nation = nation;
    }

    public Korean(int age, String name){
        this.age = age;
        this.name = name;
    }

    public Korean(){}
}

package jul11.human;

public class Korean extends Human{
    public Korean(){

    }
    public String nation = "대한민국";
    protected String name;
    String belt;
    private String ssn;



    Korean(String name, String belt){
        //

        //
        this(name, belt, "123456-1234567");
    }

    private Korean(String name, String belt, String ssn){

    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBelt() {
        return belt;
    }

    public void setBelt(String belt) {
        this.belt = belt;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
}

package march7;

import java.util.ArrayList;
import java.util.List;

public class VoterVO {

    private String city;
    private int count;
    private List<String> nameList = new ArrayList<>();


    public String getCity(){return city;}
    public int getCount(){return count;}
    public List<String> getNameList(){return nameList;}


    public void setCity(String city){this.city = city;}
    public void setCount(int count){this.count = count;}

    @Override
    public String toString() {
        return "VoterVO{" +
                "city='" + city + '\'' +
                ", nameList=" + nameList +
                '}';
    }
}

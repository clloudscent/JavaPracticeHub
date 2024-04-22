package mapPractice;

import java.util.ArrayList;
import java.util.List;

public class SushiVO {
    private String sushi;
    private String name;
    private int count;
    private List<String> nameList = new ArrayList<>();

    public String getSushi(){return sushi;}
    public String getName(){return name;}
    public int getCount(){return count;}
    public List<String> getNameList(){return nameList;}
    public void setSushi(String sushi){this.sushi = sushi;}
    public void setName(String name){this.name = name;}
    public void setCount(int count){this.count = count;}
    @Override
    public String toString() {
        return "SushiVO{" +
                "sushi='" + sushi + '\'' +
                ", name='" + name + '\'' +
                ", nameList=" + nameList +
                '}';
    }
}

package march2;

import java.util.ArrayList;
import java.util.List;

public class SushiVO {
    private int count;
    private String sushi;
    private List<String> nameList = new ArrayList<>();


    public int getCount(){return count;}
    public List<String> getNameList(){return nameList;}
    public String getSushi(){return sushi;}


    public void setCount(int count){this.count = count;}
    public void setSushi(String sushi){this.sushi = sushi;}
    public void setNameList(List<String> nameList){this.nameList = nameList;}

    @Override
    public String toString() {
        return "SushiVO{" +
                "count=" + count +
                ", sushi='" + sushi + '\'' +
                ", nameList=" + nameList +
                '}';
    }
}

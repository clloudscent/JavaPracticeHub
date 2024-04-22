package apr2627;

import java.util.ArrayList;
import java.util.List;

public class SushiVO {
    String voterName;
    String sushiName;
    int count;
    List<String> nameList = new ArrayList<>();

    public String getVoterName(){
        return voterName;
    }
    public String getSushiName(){
        return sushiName;
    }
    public int getCount(){
        return count;
    }

    public List<String> getNameList() {
        return nameList;
    }

    public void setVoterName(String voterName) {
        this.voterName = voterName;
    }
    public void setSushiName(String sushiName){
        this.sushiName = sushiName;
    }
    public void setCount(int count){
        this.count = count;
    }

    public void setNameList(List<String> nameList) {
        this.nameList = nameList;
    }
}

package sushiCount2;

import java.util.ArrayList;
import java.util.List;

public class SushiInfo {
    String sushiName;
    int count;
    List<String> userList = new ArrayList<>();

    public int getCount(){return count;}
    void setCount(int num){this.count = num;}
    void setUserList(List<String> userList){this.userList = userList;}
    void setSushiName(String sushiName){this.sushiName = sushiName;}

    @Override
    public String toString() {
        return "SushiInfo{" +
                "sushiName=" + sushiName +
                ", count=" + count +
                ", userList=" + userList +
                '}';
    }
}

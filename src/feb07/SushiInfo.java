package feb07;

import java.util.ArrayList;
import java.util.List;

public class SushiInfo {
    int sushiCount=0;

    List<String> nameList = new ArrayList<>();

    public int getSushiCount() {
        return sushiCount;
    }

    public void setSushiCount(int sushiCount) {
        this.sushiCount = sushiCount;
    }

    public List<String> getNameList() {
        return nameList;
    }

    public void setNameList(List<String> nameList) {
        this.nameList = nameList;
    }

    @Override
    public String toString() {
        return "SushiInfo{" +
                "sushiCount=" + sushiCount +
                ", nameList=" + nameList +
                '}';
    }
}

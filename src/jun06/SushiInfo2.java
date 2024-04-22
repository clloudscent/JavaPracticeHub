package jun06;

import java.util.ArrayList;
import java.util.List;

public class SushiInfo2 {
    private String sushiName;
    private int votedNum;
    private List<String> voterNameList = new ArrayList<>();

    public String getSushiName() {
        return sushiName;
    }

    public void setSushiName(String sushiName) {
        this.sushiName = sushiName;
    }

    public int getVotedNum() {
        return votedNum;
    }

    public void setVotedNum(int votedNum) {
        this.votedNum = votedNum;
    }

    public List<String> getVoterNameList() {
        return voterNameList;
    }

    public void setVoterNameList(List<String> voterNameList) {
        this.voterNameList = voterNameList;
    }

    @Override
    public String toString() {
        return sushiName+", "+votedNum+", "+voterNameList;
    }
}

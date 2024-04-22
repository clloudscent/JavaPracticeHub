package sushiCount2;

public class SushiInfo2 {
    private String sushiName;
    private int votedCount;

    public SushiInfo2(String sushiName, int votedCount) {
        this.sushiName = sushiName;
        this.votedCount = votedCount;
    }

    public String getSushiName() {
        return sushiName;
    }

    public void setSushiName(String sushiName) {
        this.sushiName = sushiName;
    }

    public int getVotedCount() {
        return votedCount;
    }

    public void setVotedCount(int votedCount) {
        this.votedCount = votedCount;
    }

    @Override
    public String toString(){
        return "{" +
                "sushiName:" +sushiName+
                ", votedCount: "+votedCount+
                "}";
    }
}

package jun06;

public class SushiInfo {
    String voterName;
    String sushiName;
    int voteCount;

    public String getVoterName() {
        return voterName;
    }

    public void setVoterName(String voterName) {
        this.voterName = voterName;
    }

    public String getSushiName() {
        return sushiName;
    }

    public void setSushiName(String sushiName) {
        this.sushiName = sushiName;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }

    @Override
    public String toString() {
        return "SushiInfo{" +
                "voterName='" + voterName + '\'' +
                ", sushiName='" + sushiName + '\'' +
                ", voteCount=" + voteCount +
                '}';
    }
}

package feb07;

import java.sql.Array;

public class SushiVO {
    String sushiName;
    int sushiCount;
    String[] name;

    public String getSushiName(){
        return sushiName;
    }
    public void setSushiName(String sushiName){
        this.sushiName = sushiName;
    }
    public int getSushiCount(){
        return sushiCount;
    }
    public void setSushiCount(int sushiCount){
        this.sushiCount = sushiCount;
    }

    public void setName(String[] name){
        this.name = name;
    }


}

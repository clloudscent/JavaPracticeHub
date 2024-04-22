package sushiCount2;

import java.util.ArrayList;
import java.util.List;

public class SushiSorting {


    public static void main(String[] args) {
        List<SushiInfo2> sushiList = new ArrayList<>();
        sushiList.add(new SushiInfo2("계란초밥", 2));
        sushiList.add(new SushiInfo2("연어초밥", 7));
        sushiList.add(new SushiInfo2("새우초밥", 3));
        sushiList.add(new SushiInfo2("장어초밥", 1));
        sushiList.add(new SushiInfo2("광어초밥", 5));
        sushiList.add(new SushiInfo2("참치초밥", 9));

        for(int i=0; i<sushiList.size(); i++){
            for(int j=0; j<sushiList.size()-i-1; j++){
                if(sushiList.get(j).getVotedCount()<sushiList.get(j+1).getVotedCount()){
                    SushiInfo2 temp = sushiList.get(j);
                    sushiList.set(j, sushiList.get(j+1));
                    sushiList.set(j+1, temp);
                }
            }
        }
        // 2,temp,3,4 temp=1
        for(int i = 0; i<sushiList.size(); i++){
            System.out.println(sushiList.get(i));
        }
    }

}

package sushiCount2;

import java.util.*;

public class SushiCount {
    public static void main(String[] args) {
        Map<String, String> inputMap = new HashMap<>();

        inputMap.put("홍길동","참치초밥");
        inputMap.put("둘리","참치초밥");
        inputMap.put("임꺽정","연어초밥");
        inputMap.put("장발장","연어초밥");
        inputMap.put("희동이","연어초밥");
        inputMap.put("호날두","계란초밥");

        Map<String, SushiInfo> sushiMap = new HashMap<>();

        ArrayList<SushiInfo> sushiInfos = new ArrayList<>();


        for(String currentName : inputMap.keySet()){

            String currentSushi = inputMap.get(currentName);
            //value값
            List<String> userList = new ArrayList<>();

            if(!sushiMap.containsKey(currentSushi)){
                SushiInfo sushiInfo = new SushiInfo();
                sushiInfo.setCount(1);
                userList.add(currentName);
                sushiInfo.setUserList(userList);
                sushiMap.put(currentSushi, sushiInfo);
                sushiInfo.setSushiName(currentSushi);
            }else {
                SushiInfo sushiInfo = sushiMap.get(currentSushi);
                userList = sushiInfo.userList;
                int count = sushiInfo.getCount() + 1;
                sushiInfo.setCount(count);
                userList.add(currentName);
            }

        }

        for(String currentSushiName : sushiMap.keySet()){
            sushiInfos.add(sushiMap.get(currentSushiName));
        }

        for(int i =0; i<sushiInfos.size(); i++){
            for(int j =0; j< sushiInfos.size()-i-1; j++){
                if(sushiInfos.get(j).count<sushiInfos.get(j+1).count){
                    SushiInfo temp = sushiInfos.get(j);
                    sushiInfos.set(j, sushiInfos.get(j+1));
                    sushiInfos.set(j+1, temp);
                }
            }
        }

        for(int i =0; i<sushiInfos.size(); i++){
            System.out.println(sushiInfos.get(i));
        }
    }
}

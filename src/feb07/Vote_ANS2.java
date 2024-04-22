package feb07;

import java.util.*;

public class Vote_ANS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> inputMap = new HashMap<>();

        for(int i =0; i<5; i++){
            String name = sc.nextLine();
            String sushi = sc.nextLine();
            inputMap.put(name, sushi);
        }
        System.out.println(inputMap);

        List<SushiVO> sushiList = new ArrayList<>();
        Map<String, SushiInfo> sushiMap =  new HashMap<>();

        for(String currentName : inputMap.keySet()) {
//            SushiVO sushiVO = new SushiVO();
            String currentSushi = inputMap.get(currentName);
            if(!sushiMap.containsKey(currentSushi)){
                SushiInfo sushiInfo = new SushiInfo();
                sushiInfo.setSushiCount(1);
                sushiInfo.getNameList().add(currentName);
                sushiMap.put(currentSushi, sushiInfo);
//                sushiMap.put(inputMap.get(currentName), 1);
            }else{
                SushiInfo sushiInfo = sushiMap.get(currentSushi);
                sushiInfo.setSushiCount(sushiInfo.getSushiCount()+1);
                sushiInfo.getNameList().add(currentName);
//                sushiMap.put(currentSushi, sushiInfo);
            }
        }


        System.out.println(sushiMap);





        int temp = 0;
      /*  List<VO> sushiRankList = new ArrayList<>();
        for(String currentName : sushiMap.keySet()){
            for(String comparingName : sushiMap.keySet()){
                if(sushiMap.get(currentName)<sushiMap.get(comparingName)){
                   VO vo = new VO();
                    String sushi = currentName;
                }
            }
        }*/

    }
}

package feb07;

import java.util.*;

public class Vote {
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
        Map<String, Integer> sushiMap =  new HashMap<>();

        for(String currentName : inputMap.keySet()) {
            SushiVO sushiVO = new SushiVO();
            String currentSushi = inputMap.get(currentName);
            if(!sushiMap.containsKey(currentSushi)){
                sushiMap.put(inputMap.get(currentName), 1);
            }else{
                int currentCount = sushiMap.get(currentSushi)+1;
                sushiMap.put(currentSushi, currentCount);
            }

            sushiVO.setSushiName(currentSushi);
            sushiVO.setSushiCount(sushiMap.get(currentSushi));
//            sushiVO.setName(currentName);

            sushiList.add(sushiVO);
        }
        System.out.println(sushiMap);

        System.out.println(sushiList.size());

        for(int i =0; i<sushiList.size(); i++){
            System.out.println(sushiList.get(i).sushiName);
            System.out.println(sushiList.get(i).sushiCount);
            System.out.println(sushiList.get(i).name);

        }




        int temp = 0;
        List<VO> sushiRankList = new ArrayList<>();
        for(String currentName : sushiMap.keySet()){
            for(String comparingName : sushiMap.keySet()){
                if(sushiMap.get(currentName)<sushiMap.get(comparingName)){
                   VO vo = new VO();
                    String sushi = currentName;
                }
            }
        }

        System.out.println(sushiMap);
    }
}

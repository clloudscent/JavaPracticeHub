package feb07;

import java.util.*;

public class Vote_ANS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //key: 사람이름, value: 해당인원이 투표한 초밥
        Map<String, String> inputMap = new HashMap<>();

        for(int i =0; i<5; i++){
            String name = sc.nextLine();
            String sushi = sc.nextLine();
            inputMap.put(name, sushi);
        }
        System.out.println(inputMap);

        //key: 초밥이름, value: 투표받은 개수
        Map<String, Integer> sushiMap =  new HashMap<>();
        for(String currentName : inputMap.keySet()){
            String currentSushi = inputMap.get(currentName);

            if(!sushiMap.containsKey(currentSushi)){
                sushiMap.put(currentSushi, 1);
            }else{
                int currentCount = sushiMap.get(currentSushi)+1;
                sushiMap.put(currentSushi, currentCount);
            }
        }
        System.out.println(sushiMap);

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

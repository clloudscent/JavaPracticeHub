package apr2627;

import java.util.*;

public class SushiVoter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> inputMap = new HashMap<>();

        System.out.println("인원수: ");
        int inputNum = sc.nextInt();
        sc.nextLine();
        for(int i =0; i<inputNum; i++){
            System.out.println("이름");
            String name = sc.nextLine();
            System.out.println("초밥");
            String sushi = sc.nextLine();
            inputMap.put(name, sushi);

        }


        Map<String, SushiVO> sortedMap = new HashMap<>();

        for(String currentName : inputMap.keySet()){
            String currentSushi = inputMap.get(currentName);
            if(!sortedMap.containsKey(currentSushi)){
                SushiVO sushiVO = new SushiVO();
                sushiVO.setCount(1);
                sushiVO.setSushiName(currentSushi);
                sortedMap.put(currentSushi, sushiVO);
                sushiVO.getNameList().add(currentName);
            }else{
                //이름추가 및 count불러와서 1증가시키기
                sortedMap.get(currentSushi).setCount(sortedMap.get(currentSushi).getCount()+1);
                sortedMap.get(currentSushi).getNameList().add(currentName);
            }
        }

        List<SushiVO> resultList = new ArrayList<>();
        for(String currentSushi : sortedMap.keySet()){
            resultList.add(sortedMap.get(currentSushi));
        }
        for(int i =0; i< resultList.size()-1; i++){
            //버블소팅
            for(int j =i+1; j< resultList.size(); j++){
                //getCount비교
                if(resultList.get(i).getCount()<resultList.get(j).getCount()){
                    SushiVO temp = resultList.get(i);
                    resultList.set(i, resultList.get(i));
                    resultList.set(j, temp);
                }
            }
        }

        for(int i =0; i< resultList.size(); i++){
            System.out.println(resultList.get(i).getSushiName());
            System.out.println(resultList.get(i).getCount());
            System.out.println(resultList.get(i).getNameList());

        }
    }
}

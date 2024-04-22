package march2;

import java.util.*;

public class SushiCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> inputMap = new HashMap<>();
        for(int i=0; i<5; i++){
            System.out.print("이름: ");
            String name = sc.nextLine();
            System.out.print("초밥: ");
            String sushi = sc.nextLine();
            inputMap.put(name, sushi);
        }
        System.out.println(inputMap);

        Map<String, SushiVO> sortedMap = new HashMap<>();
        for(String currentName : inputMap.keySet()){
            String currentSushi = inputMap.get(currentName);
            if(!sortedMap.containsKey(currentSushi)){
                SushiVO sushiVO = new SushiVO();
                System.out.println("sushiVO 객체생성");
                sushiVO.setCount(1);
                System.out.println("count = 1");
                sushiVO.setSushi(currentSushi);
                sushiVO.getNameList().add(currentName);
                //
                sortedMap.put(currentSushi, sushiVO);
            }else{
                //count 1증가
                //이름추가
                sortedMap.get(currentSushi).setCount(sortedMap.get(currentSushi).getCount()+1);
                sortedMap.get(currentSushi).getNameList().add(currentName);
            }
        }

        List<SushiVO> resultList = new ArrayList<>();
        for(String currentSushi : sortedMap.keySet()){
           resultList.add(sortedMap.get(currentSushi));
        }


        for(int i =0; i<resultList.size()-1; i++){
            for(int j=i+1; j<resultList.size(); j++){
                if(resultList.get(i).getCount()<resultList.get(j).getCount()){
                 SushiVO temp = resultList.get(i);
                 resultList.set(i,resultList.get(j));
                 resultList.set(j,temp);
                }
            }
        }

        for(int i=0; i<resultList.size(); i++){
            System.out.print(resultList.get(i).getSushi()+", "
                            +resultList.get(i).getCount()+"회, "
                            +resultList.get(i).getNameList());
            System.out.println();
        }
    }
}

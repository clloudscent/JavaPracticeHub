package mapPractice;

import java.util.*;

public class SushiCount {
    public static void main(String[] args) {
        //이름, 초밥
        //초밥, 횟수, (선택한사람 이름)
        Scanner sc = new Scanner(System.in);
        Map<String, String> inputMap = new HashMap<>();

        for(int i=0; i<5; i++){
            System.out.print("이름: ");
            String name = sc.nextLine();
            System.out.print("초밥: ");
            String sushi = sc.nextLine();
            inputMap.put(name, sushi);
        }

        Map<String, SushiVO> sushiVOMap = new HashMap<>();
        for(String currentName : inputMap.keySet()){
            String currentSushi = inputMap.get(currentName);
            if(!sushiVOMap.containsKey(currentSushi)){
                //map에 아무것도 없으므로 객체생성
                SushiVO sushiVO = new SushiVO();
                sushiVO.setCount(1);
                sushiVO.setSushi(currentSushi);
                sushiVO.getNameList().add(currentName);
                sushiVOMap.put(currentSushi,sushiVO);
            }else{
                sushiVOMap.get(currentSushi).setCount(sushiVOMap.get(currentSushi).getCount()+1);
                sushiVOMap.get(currentSushi).getNameList().add(currentName);
            }
        }

        //sushiVO 정렬

        List<SushiVO> resultList = new ArrayList<>();

        //sushiVOMap의 value값을 리스트에 담고, 리스트의 count값으로 배열을 정렬

        for(String currentSushi : sushiVOMap.keySet()){
            resultList.add(sushiVOMap.get(currentSushi));
        }

        for(int i = 0; i<resultList.size(); i++){
            for(int j = i+1; j<resultList.size(); j++){
                if(resultList.get(i).getCount()<resultList.get(j).getCount()){
                    SushiVO temp = resultList.get(i);
                    resultList.set(i, resultList.get(j));
                    resultList.set(j, temp);
                }
            }
        }
        for (int i =0; i<resultList.size(); i++){
            //초밥, 횟수, (선택한사람 이름)
            System.out.println(resultList.get(i).getSushi()+": "+resultList.get(i).getCount()+"회, "+ resultList.get(i).getNameList());
        }

    }
}

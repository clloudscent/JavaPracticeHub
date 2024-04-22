package Car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountList6_ANS {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("길동");
        nameList.add("둘리");
        nameList.add("길동");
        nameList.add("희동");
        nameList.add("길동");
        nameList.add("둘리");
        nameList.add("희동");
        nameList.add("희동");
        nameList.add("희동");
        nameList.add("꺽정");

        Map<String, Integer> nameCountMap = new HashMap<>();

        for(String name : nameList){
            if(nameCountMap.containsKey(name)){
                int currentCount = nameCountMap.get(name);
                nameCountMap.put(name, currentCount+1);
            }else {
                nameCountMap.put(name, 1);
            }
        }

        int mostNameCount = 0;
        String mostCountedName = "";

        for(String currentName : nameCountMap.keySet()){
            int currentCount = nameCountMap.get(currentName);
            if(currentCount>mostNameCount){
                mostNameCount = currentCount;
                mostCountedName = currentName;
            }
        }

        System.out.println("가장 많이 담긴 이름은 "+mostCountedName+"입니다. 횟수는: "+mostNameCount+"회 입니다.");
    }
}

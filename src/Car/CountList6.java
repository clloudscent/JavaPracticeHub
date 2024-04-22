package Car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountList6 {
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
                nameCountMap.put(name, nameCountMap.get(name)+1);
            }else{
                nameCountMap.put(name, 1);
            }
        }

        //key와 value를 동시에 접근해서 다루는 Loop방식
        for(Map.Entry<String, Integer> currentEntry : nameCountMap.entrySet()){
            currentEntry.getKey();
            currentEntry.getValue();
        }
       int mostCounted = 0;
        String mostCountedName = "";
        for(Map.Entry<String, Integer> currentEntry : nameCountMap.entrySet()){
            if(currentEntry.getValue()>mostCounted){
                mostCounted = currentEntry.getValue();
                mostCountedName = currentEntry.getKey();
            }
        }
        System.out.println(mostCountedName);
        System.out.println(mostCounted);


       /*
        String mostCountedName = "";
        int mostCounted = 0;
        int currentCounted = 0;
        //key만 접근 후, value값은 접근 한 key를 이용해서 map에서 가져와서 사용하는 방식
        for(String currentName : nameCountMap.keySet()){
            currentCounted = nameCountMap.get(currentName);
            if(currentCounted>mostCounted){
                 mostCountedName = currentName;
                 mostCounted = nameCountMap.get(currentName);
            }
        }
        System.out.println(mostCountedName);
        System.out.println(mostCounted);

        */
    }
}

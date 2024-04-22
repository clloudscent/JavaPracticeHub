package nameCount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NameCount4 {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();

        nameList.add("짱구");
        nameList.add("철수");
        nameList.add("철수");
        nameList.add("짱구");
        nameList.add("훈이");
        nameList.add("훈이");
        nameList.add("짱구");
        nameList.add("철수");
        nameList.add("철수");


        Map<String, Integer> nameMap = new HashMap<>();

        for (int i = 0; i < nameList.size(); i++) {
            String currentName = nameList.get(i);

            if (!nameMap.containsKey(nameList.get(i))) {
                nameMap.put(currentName, 1);
                continue;
            }
            int count = nameMap.get(currentName) + 1;
            nameMap.put(currentName, count);
        }
        System.out.println(nameMap);

        int topCount = 0;
        String mostCountedName = "";
        for(String currentName : nameMap.keySet()){
            System.out.println(currentName);
            int currentCount = nameMap.get(currentName);

            if(currentCount>topCount){
                topCount = currentCount;
                mostCountedName = currentName;
            }
        }
        System.out.println(mostCountedName+", "+topCount);

    }
}

package nameCount2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstNameCount {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("홍길동");
        nameList.add("임꺽정");
        nameList.add("홍둘리");
        nameList.add("홍상희");
        nameList.add("손흥민");
        nameList.add("손흥민");
        nameList.add("손흥민");
        nameList.add("손둘리");
        Map<String, Integer> firstNameMap = new HashMap<>();
        for(int i =0; i<nameList.size(); i++){
            String currentName = nameList.get(i).substring(1);
            if(firstNameMap.containsKey(currentName)){
                int currentCount = firstNameMap.get(currentName)+1;
                firstNameMap.put(currentName, currentCount);
            }else{
                firstNameMap.put(currentName, 1);
            }
        }
        String mostCountedName = "";
        int mostCounted = 0;
        for(String currentName : firstNameMap.keySet()){
            int currentCount = firstNameMap.get(currentName);
            if(currentCount>mostCounted){
                mostCounted = currentCount;
                mostCountedName = currentName;
            }
        }
        System.out.println(firstNameMap);
        System.out.println(mostCountedName+mostCounted);
    }
}

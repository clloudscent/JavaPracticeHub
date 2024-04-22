package nameCount3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NameCount {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("홍길동");
        nameList.add("임꺽정");
        nameList.add("홍둘리");
        nameList.add("홍상희");
        nameList.add("손흥민");
        nameList.add("손둘리");
        nameList.add("호날두");
        nameList.add("메시");
        nameList.add("즐라탄");
        nameList.add("호날두");
        nameList.add("호날두");
        nameList.add("즐라탄");
        nameList.add("홍둘리");

        Map<String, Integer> nameMap = new HashMap<>();

        for(int i =0; i<nameList.size(); i++){
            String currentName = nameList.get(i);
            if(nameMap.containsKey(currentName)){
                int currentCount = nameMap.get(currentName)+1;
                nameMap.put(currentName, currentCount);
            }else{
                nameMap.put(currentName,1);
            }
        }

        ArrayList<String> topThreeName = new ArrayList<>();
        int count = 0;
        int mostCounted = 0;
        String mostCountedName = "";
        String removeKey ="";
        boolean isRunnable = true;
        while(isRunnable){
            for(String currentName : nameMap.keySet()){
                int currentCount = nameMap.get(currentName);
                if(mostCounted<currentCount){
                    mostCounted = currentCount;
                    mostCountedName = currentName;
                }
            }
            topThreeName.add(mostCountedName);
            removeKey = mostCountedName;
            count++;
            mostCounted = 0;
            if(count==3){
                isRunnable = false;
            }
            nameMap.remove(removeKey);
            System.out.println(nameMap);
        }
        System.out.println(topThreeName);
    }
}

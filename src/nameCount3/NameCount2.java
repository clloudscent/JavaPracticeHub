package nameCount3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NameCount2 {
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
        nameList.add("홍길동");

        Map<String, Integer> nameMap = new HashMap<>();

        for (int i = 0; i < nameList.size(); i++) {
            String currentName = nameList.get(i);
            if (nameMap.containsKey(currentName)) {
                int currentCount = nameMap.get(currentName) + 1;
                nameMap.put(currentName, currentCount);
            } else {
                nameMap.put(currentName, 1);
            }
        }


        List<NameInfo> refinedNameListInfo = new ArrayList<>();


        for (String currentName : nameMap.keySet()) {
            NameInfo nameVariable = new NameInfo();
            nameVariable.setName(currentName);
            nameVariable.setCount(nameMap.get(currentName));
            refinedNameListInfo.add(nameVariable);
        }

        NameInfo temp;
        for (int i = 0; i < refinedNameListInfo.size(); i++) {
            for (int j = 0; j < refinedNameListInfo.size(); j++) {
                if (refinedNameListInfo.get(i).getCount() < refinedNameListInfo.get(j).getCount()) {
                    temp = refinedNameListInfo.get(i);
                    refinedNameListInfo.set(i, refinedNameListInfo.get(j));
                    refinedNameListInfo.set(j, temp);
                }
            }
        }
        for (int i = 0; i < refinedNameListInfo.size(); i++) {
//            System.out.println(refinedNameList.size());
            System.out.println(refinedNameListInfo.get(i).getName() + ", " + refinedNameListInfo.get(i).getCount());
        }
    }
}

package nameCount;

import java.util.ArrayList;
import java.util.List;

public class NameCount3_REF {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("짱구");
        nameList.add("짱구");
        nameList.add("철수");
        nameList.add("맹구");
        nameList.add("맹구");
        nameList.add("맹구");
        nameList.add("훈이");
        nameList.add("맹구");
        nameList.add("훈이");
        nameList.add("짱구");

        String topCountedName = "";
        int topCount = 0;

        for(int i =0; i<nameList.size(); i++){
            String currentName = nameList.get(i);
            int currentNameCount = 0;
            for(int j=0; j<nameList.size();j++){
                if(nameList.get(j).equals(currentName)){
                    currentNameCount++;
                }
            }
            if(currentNameCount>topCount){
                topCount = currentNameCount;
                topCountedName = currentName;
            }
        }


        System.out.println(topCountedName+topCount);



    }
}

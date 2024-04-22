package nameCount;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListAndSet {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        Set<String> nameSet = new HashSet<>();

        nameList.add("짱구");
        nameList.add("짱구");
        nameList.add("짱구");
        nameList.add("훈이");
        nameList.add("맹구");
        nameList.add("철수");

        nameSet.add("짱구");
        nameSet.add("짱구");
        nameSet.add("짱구");
        nameSet.add("훈이");
        nameSet.add("맹구");
        nameSet.add("철수");

        for(int i=0; i<nameList.size();i++){
//            String currentName = nameList.get(i);
//            System.out.println(currentName);
        }

        for(String currentName: nameList){
            System.out.println(currentName);
        }
        System.out.println("\n\n");
        for(String currentName: nameSet){
            System.out.println(currentName);
        }



    }
}

package jan19DAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NameCount {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("andy");
        nameList.add("alex");
        nameList.add("andy");
        nameList.add("henry");
        nameList.add("andy");
        nameList.add("henry");
        nameList.add("henry");
        nameList.add("henry");
        nameList.add("henry");
        nameList.add("henry");
        nameList.add("alex");
        System.out.println(nameCount(nameList));
    }


    /*public static String nameCount(List<String> nameList){
        Map<String, Integer> nameMap = new HashMap<>();
        int count =0;
        int mostCounted = 0;
        int mostCountedValueOfI = 0;
        for(int i=0; i<nameList.size(); i++){
            nameMap.put(nameList.get(i), 1);
            if(nameMap.containsKey(nameList.get(i))){
                count = nameMap.get(nameList.get(i))+1;
                nameMap.put(nameList.get(i), count);
            }
            mostCounted += nameMap.get(nameList.get(i));
            if(nameMap.get(nameList.get(i))>mostCounted){
                mostCounted = nameMap.get(nameList.get(i));
                mostCountedValueOfI = i;
            }
        }
        return nameList.get(mostCountedValueOfI);
    }*/
    public static String nameCount(List<String> nameList){
        //andy alex andy
        int count =0;
        int mostCounted = 0;
        String currentName = "";
        String savedName = "";
        int mostCountedValueOfI = 0;
        for(int i=0; i<nameList.size(); i++){
           currentName = nameList.get(i);
           savedName = currentName;
           if(i!=0){
               for(int j=1; j<nameList.size(); j++){
                   if(savedName.equals(nameList.get(j))){
                       count++;
                   }
                   if(count>mostCounted){
                       mostCounted = count;
                       mostCountedValueOfI = nameList.indexOf(savedName);
                   }
                }


           }else{
               count ++;
           }

        }
        return nameList.get(mostCountedValueOfI);
    }
}


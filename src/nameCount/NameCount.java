package nameCount;

import java.util.ArrayList;
import java.util.List;

public class NameCount {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("짱구");
        nameList.add("짱구");
        nameList.add("철수");
        nameList.add("맹구");
        nameList.add("훈이");
        nameList.add("훈이");
        nameList.add("짱구");


        String currentName = "";

        List<String> extractedNameList = new ArrayList<>();



        for(int i =0; i<nameList.size(); i++){
            currentName = nameList.get(i);

            if(extractedNameList.get(i).isBlank()){
                extractedNameList.add(currentName);
            }

            if(!currentName.equals(extractedNameList.get(i))){
                extractedNameList.add(currentName);
            }
        }

        for(int i=0; i<extractedNameList.size(); i++){
            System.out.println(extractedNameList.get(i));
        }

    }
}

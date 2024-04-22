package nameCount;

import java.util.ArrayList;
import java.util.List;

public class NameCount2 {
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

            boolean isNameExist = false;

            for(int j=0; j<extractedNameList.size();j++){
                if(extractedNameList.get(j).equals(currentName)){
                    isNameExist = true;
                    break;
                }
            }

            if(!isNameExist){
                extractedNameList.add(currentName);
            }
        }

        int nameCount = 0;
        int topCounted = 0;
        String temp = "";
        String topCountedName = "";


        for(int i=0; i<extractedNameList.size(); i++){
            //System.out.println(extractedNameList.get(i));
            for(int j=0; j<nameList.size(); j++){
                if(extractedNameList.get(i).equals(nameList.get(j))){
                    nameCount++;
                }
                temp = nameList.get(j);
            }
            if(nameCount>topCounted){
                topCounted = nameCount;
                topCountedName = temp;
            }
            nameCount = 0;
        }
        System.out.println(topCountedName+topCounted);



    }
}

package Car;

import java.util.ArrayList;
import java.util.List;

public class CountList4 {
    public static void main(String[] args) {
        List<String> temp = new ArrayList<>();
        temp.add("맹구");
        temp.add("영희");
        temp.add("민수");
        temp.add("영희");
        temp.add("철수");
        temp.add("희동");
        temp.add("희동");
        temp.add("영희");
        List<String> nameList = new ArrayList<>();
        int count = 0;
        int duplicateNum = 0;
        for(int i =0; i<temp.size(); i++){
            String currentName = temp.get(i);
            int currentNameCount = 0;
            System.out.println(currentName);
            for(int j =0; j<temp.size(); j++){
                if(currentName.equals(temp.get(j))){
                    duplicateNum = j;
                    System.out.println(currentName+":"+duplicateNum+"번째에 같은이름 존재");
                    System.out.println(j);
                    currentNameCount++;
                    //System.out.println(currentName+"불린 횟수: "+ );
                }
            }
            System.out.println("current Name: "+currentName+", count: "+currentNameCount);


        }
    }
}

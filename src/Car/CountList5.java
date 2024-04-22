package Car;

import java.util.ArrayList;
import java.util.List;

public class CountList5 {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("길동");
        nameList.add("둘리");
        nameList.add("길동");
        nameList.add("희동");
        nameList.add("길동");
        nameList.add("둘리");
        nameList.add("희동");
        nameList.add("희동");
        nameList.add("희동");
        nameList.add("꺽정");



        String mostCountedName = "";
        int mostCounted = 0;

        String currentName = "";
        int currentCount = 0;
        for(int j = 0; j<nameList.size(); j++){
            if(!nameList.get(j).equals(mostCountedName)){
                currentName = nameList.get(j);
            }
            for(int k = 0; k<nameList.size(); k++) {
                if (nameList.get(j).equals(currentName)) {
                    currentCount++;
                }
            }
        }
        if(currentCount>mostCounted){
            mostCountedName = currentName;
            mostCounted = currentCount;
        }
        System.out.println(mostCountedName+":"+mostCounted);

        //mostCountedName = null; mostCounted = 0; currentName = null; currentCount = 0;
        //1. mostCountedName 이 null  일 때, 리스트의 가장 첫번쨰 이름으로 초기화시키고, 리스트를 돌면서 해당 이름이 몇번 불렸는지 Count 하여 mostCounted 를 초기화 (2번을 하면서 count 비교 후 currentCount 가 높을 시 currentName, currentCount 가 Most 로 대체)
        //2. 리스트를 돌면서 이름이 중복되지 않을 떄 currentName 해당 이름으로 초기화하고, 해당이름이 몇번 불렸는지 count 하여 currentCount 초기화

    }
}

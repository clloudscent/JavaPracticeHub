package Car;

import java.util.List;

public class CountListTest {
    String nameCounter(List<String> nameList){
        int counted = 0;
        String mostCountedName = null;
        for(int i =0; i<nameList.size(); i++){
            if(mostCountedName==null){
                mostCountedName = nameList.get(i);
                    for(int j=0; j<nameList.size(); j++){
                        if(mostCountedName.equals(nameList.get(j))){
                        counted++;
                        }
                    }
            }else{
                if(!mostCountedName.equals(nameList.get(i)))
                    for(int j=0; j<nameList.size(); j++) {
                        if (mostCountedName.equals(nameList.get(j))) {
                            counted++;
                        }
                    }
            }
        }
        return mostCountedName;
    }
}

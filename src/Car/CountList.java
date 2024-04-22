package Car;

import java.util.List;

public class CountList {
    String nameCounter(List<String> nameList){
        int mostCounted = 0;
        int counted = 0;
        int jNumber = 0;
        String mostCountedName = null;
        for(int i =0; i<nameList.size(); i++){
            if(nameList.get(i)!=null){
                if(mostCountedName==null){
                    mostCountedName = nameList.get(i);
                }
                for(int j=0; j<nameList.size(); j++){
                    if(mostCountedName.equals(nameList.get(j))){
                        counted++;
                    }
                    if(counted>mostCounted){
                        jNumber = j;
                        mostCounted = counted;
                        mostCountedName = nameList.get(j);
                    }
                }
                if(counted>mostCounted){
                    mostCounted = counted;
                    mostCountedName = nameList.get(jNumber);
                }
            }
        }
        return mostCountedName;
    }
}

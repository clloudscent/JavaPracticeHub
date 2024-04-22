package nameCount2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NameCount {
    public static void main(String[] args) {

        //Map<String, Integer> firstNameMap = new HashMap<>();

        List<String> nameList = new ArrayList<>();
        nameList.add("홍길동");
        nameList.add("임꺽정");
        nameList.add("홍둘리");
        nameList.add("홍상희");
        nameList.add("손흥민");
        nameList.add("손흥민");
        nameList.add("손흥민");
        nameList.add("손둘리");


        Map<String, Integer> lastNameMap = new HashMap<>();
        Map<String, Integer> firstNameMap = new HashMap<>();

        for(int i =0; i<nameList.size(); i++){

            String currentLastName = nameList.get(i).substring(0,1);
            String currentFirstName = nameList.get(i).substring(1);

            //lastName
            if(lastNameMap.containsKey(currentLastName)){
                int currentLastNameCount = lastNameMap.get(currentLastName)+1;
                lastNameMap.put(currentLastName, currentLastNameCount);
            }else{
                lastNameMap.put(currentLastName, 1);
            }

            //firstName
            if(firstNameMap.containsKey(currentFirstName)){
                int currentFirstNameCount = firstNameMap.get(currentFirstName)+1;
                firstNameMap.put(currentFirstName, currentFirstNameCount);
            }else{
                firstNameMap.put(currentFirstName,1);
            }
        }

        String mostCountedLastName = "";
        String mostCountedFirstName = "";
        int numberOfMostCountedLastName = 0;
        int numberOfMostCountedFirstName = 0;
        for(String currentLastName : lastNameMap.keySet()){
            int currentCount = lastNameMap.get(currentLastName);
            if(currentCount>numberOfMostCountedLastName){
                numberOfMostCountedLastName = currentCount;
                mostCountedLastName = currentLastName;
            }
        }
        for(String currentFirstName : firstNameMap.keySet()){
            int currentCount = firstNameMap.get(currentFirstName);
            if(currentCount>numberOfMostCountedFirstName){
                numberOfMostCountedFirstName = currentCount;
                mostCountedFirstName = currentFirstName;
            }
        }
        System.out.println("제일많은 성씨 "+mostCountedLastName+"씨,"+numberOfMostCountedLastName+"회");
        System.out.println("제일많은 이름 "+mostCountedFirstName+","+numberOfMostCountedFirstName+"회");


        /*for(String currentName : nameListMap.keySet()){
            String firstName = nameListMap.get(currentName);
            if(firstNameMap.containsKey(firstName)){
                int currentCount = firstNameMap.get(currentName)+1;
                firstNameMap.put(currentName, currentCount);
            }else{
                firstNameMap.put(currentName, 1);
            }
        }
        System.out.println(firstNameMap);*/
    }
}


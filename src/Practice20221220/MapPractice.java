package Practice20221220;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {

        Map<String, Student> studentNameById = new HashMap<>();

        studentNameById.put("20190203322", new Student("20190203322", "홍길동",23));
        studentNameById.put("20200201322", new Student("20200203322", "임꺽정",23));
        studentNameById.put("20210701342", new Student("20210701342", "고길동",23));


        for(Map.Entry<String, Student> elem : studentNameById.entrySet()){
            System.out.println("key: "+elem.getKey()+", value: "+elem.getValue());
        }

        //enhanced for loop
        for(String currentKey : studentNameById.keySet()){
            System.out.println("key :"+currentKey+", value: "+studentNameById.get(currentKey));
        }

        List<Integer> intList = new ArrayList<>();
        intList.add(7);
        intList.add(2);
        intList.add(4);
        intList.add(5);
        intList.add(7);
        intList.add(1);

        for(int i=0; i<intList.size();i++){
            System.out.println(intList.get(i));
        }

        for(Integer currentNum:intList){
            System.out.println(currentNum);
        }
    }
}

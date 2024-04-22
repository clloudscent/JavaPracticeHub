package assignment2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Num02 {
    public static void main(String[] args) {
        HashMap<String, Integer> tempMap = new HashMap<>();
        List<String> list = new ArrayList<>();
        list.add("영국인");
        list.add("영국인");
        list.add("한국인");
        list.add("미국인");
        list.add("미국인");
        list.add("중국인");
        list.add("이탈리아인");
        list.add("이탈리아인");
        list.add("이탈리아인");
        list.add("이탈리아인");

        for(String a : list){
            if(tempMap.containsKey(a)){
                tempMap.put(a,tempMap.get(a)+1);
            }else{
                //처음
                tempMap.put(a, 1);
            }
        }


        System.out.println(tempMap);
    }
}

package oct25;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TextCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        Map<String, Integer> textCountMap = new HashMap<>();

        for(int i =0; i<userInput.length(); i++){
            Integer count = textCountMap.get(userInput.substring(i,i+1));
            if(textCountMap.containsKey(userInput.substring(i,i+1))){
                textCountMap.put(userInput.substring(i,i+1),count+1);
            }else{
                textCountMap.put(userInput.substring(i,i+1),1);
            }
        }

        for(String key: textCountMap.keySet()){
            Integer value = textCountMap.get(key);
            System.out.println(key+":"+value);
        }
    }
}

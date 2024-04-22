package oct25;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TextCount_ANS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        Map<String, Integer> textCountMap = new HashMap<>();

        for(int i =0; i<userInput.length(); i++){
            String currentChar = userInput.substring(i, i+1);
            if(textCountMap.containsKey(currentChar)){
                textCountMap.put(currentChar,textCountMap.get(currentChar)+1);
            }else{
                textCountMap.put(currentChar,1);
            }
        }

        for(String key: textCountMap.keySet()){
            Integer value = textCountMap.get(key);
            System.out.println(key+":"+value);
        }
    }
}

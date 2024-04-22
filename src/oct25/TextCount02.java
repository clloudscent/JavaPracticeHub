package oct25;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TextCount02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        Map<String, Integer> textCountMap = new HashMap<>();

        for(int i =0; i<userInput.length(); i++){
            String currentText = userInput.substring(i,i+1);
            if(textCountMap.containsKey(currentText)){
                Integer count = textCountMap.get(currentText);
                textCountMap.put(currentText,count+1);
            }else{
                textCountMap.put(currentText,1);
            }
        }

        for(String key: textCountMap.keySet()){
            Integer value = textCountMap.get(key);
            System.out.println(key+":"+value);
        }
    }
}

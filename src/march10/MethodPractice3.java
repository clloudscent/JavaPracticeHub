package march10;

import java.util.*;

public class MethodPractice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> charList = new ArrayList<>();
        for(int i =0; i<2; i++){
            String word = sc.nextLine();
            System.out.println("문자길이:"+word.length());
            for(int j = 0; j<word.length(); j++){
                if(j<word.length()){
                    charList.add(word.substring(j,j+1));
                }
            }
        }

        List<String> reverseList = new ArrayList<>();
        List<String> vowelList = new ArrayList<>();
        Map<String,String> vowelMap = new HashMap<>();
        vowelMap.put("a","A");
        vowelMap.put("e","E");
        vowelMap.put("i","I");
        vowelMap.put("o","O");
        vowelMap.put("u","U");
        for(int i = charList.size()-1; i>=0; i--){
            reverseList.add(charList.get(i));
        }

        for(int i=0; i<reverseList.size(); i++){
            if(vowelMap.containsKey(reverseList.get(i))){
                reverseList.set(i, vowelMap.get(reverseList.get(i)));
            }
        }
        System.out.println(charList);
        System.out.println(reverseList);
    }
}

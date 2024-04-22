package march10;

import java.util.*;

public class MethodPractice4_Method {
    public static void main(String[] args) {
        /*String inputString = sc.nextLine();
        List<Character> charList = new ArrayList<>();
        char[] charA = new char[inputString.length()];
        for(int i=0; i<inputString.length();i++){
            //charList.add(inputString.charAt(i));
            charA[i] = inputString.charAt(i);
        }
    }
    public static char[] insert(char[] a, char[] b){
        char[] wordChar = a; //char [s,k,y]*/


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
            if(vowelMap.containsKey(charList.get(i))){
                reverseList.add(vowelMap.get(charList.get(i)));
            }else{
                reverseList.add(charList.get(i));
            }

        }
        System.out.println(charList);
        System.out.println(reverseList);
    }
}

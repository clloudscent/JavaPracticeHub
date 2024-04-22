package march10;

import java.util.*;

public class MethodPractice3_Method {

    public static List<String> addInputStringToList(){
        Scanner sc = new Scanner(System.in);
        List<String> charList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            String word = sc.nextLine();
            System.out.println("문자길이:" + word.length());
            for (int j = 0; j < word.length(); j++) {
                charList.add(word.substring(j, j + 1));
            }
        }
        return charList;
    }

    public static List<String> reverseList(List<String> inputList){
        List<String> reverseList = new ArrayList<>();

        for (int i = inputList.size() - 1; i >= 0; i--) {
            reverseList.add(inputList.get(i));
        }
        return reverseList;
    }

    public static List<String> convertVowel(List<String> inputList){
        List<String> resultList = new ArrayList<>();
        Map<String, String> vowelMap = new HashMap<>();
        vowelMap.put("a", "A");
        vowelMap.put("e", "E");
        vowelMap.put("i", "I");
        vowelMap.put("o", "O");
        vowelMap.put("u", "U");
        for (int i = 0; i < inputList.size(); i++) {
            if (vowelMap.containsKey(inputList.get(i))) {
                resultList.add(vowelMap.get(inputList.get(i)));
            }else{
                resultList.add(inputList.get(i));
            }
        }
        return resultList;
    }

    public static void main(String[] args) {

        /*List<String> charList = addInputStringToList();

        List<String> reverseList = reverseList(charList);

        List<String> resultList = convertVowel(reverseList);
        System.out.println(charList);
        System.out.println(reverseList);
        System.out.println(resultList);*/

        convertVowel(reverseList(addInputStringToList()));
    }
}

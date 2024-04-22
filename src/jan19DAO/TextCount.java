package jan19DAO;

import java.util.HashMap;
import java.util.Map;

public class TextCount {
    public Map mostCountedText(String inputText) {
        Map<String, Integer> stringMap = new HashMap<>();
        //applel
        // apple 문자열에 한 글자씩 접근해야한다. ->for문과 subString()이용
        //현재 접근한 해당 문자를 currentText라는 String타입의 변수에 대입한다.
        // 현재 접근한 해당 문자를 Map의 key로 지정하여 put을 한다. value는 미리 선언한 int count 값(현재값:1)을 임의로 넣는다.
        //for문이 두번째 돌 때, 첫번째로 담긴 currentText와 비교하여, 다르면 새로운 Map의 key로 지정하여 put을 하고, 중복되었으면, count ++를 하고 count를 put 한다.

        String currentText = "";
        String savedText = "";
        int savedCount = 1; //누적됨
        int firstCount = 1;
        //appaaap
        //savedCount =1,  firstCount = 1
        //a=1
        //p=
        for(int i=0; i<inputText.length()-1; i++){
            currentText = inputText.substring(i,i+1);
            if(i==0){
                savedText = currentText;
                stringMap.put(currentText, firstCount);
            }else if(i!=0){
                if(savedText.equals(currentText)){
                    savedCount++;
                    stringMap.put(currentText, savedCount);
                }else{
                    stringMap.put(currentText, firstCount);
                }
            }
        }







       /* int textCounted = 0;
        for (int i = 0; i < inputText.length()-1; i++) {
            String currentText = inputText.substring(i, i + 1); //a
            for (int j = 0; j < inputText.length()-1; j++) {
                if (currentText.equals(inputText.substring(j, j + 1))) { //p
                    textCounted++;
                }
                stringMap.put(inputText.substring(i, i + 1), textCounted);
            }
        }*/





        /*String mostCountedText = "";
        int mostCountedTextNum = 0;
        for(int i =0; i<inputText.length(); i++){
            //첫번째 글자처리
            int countText = 0;

            String character = inputText.substring(i, i+1);

            if(i==0){
                String firstText = inputText.substring(0, i);
                for(int j =0; j<inputText.length(); j++){
                    if(firstText.equals(inputText.substring(0,j))){
                        mostCountedTextNum ++;
                    }
                }

            }else if(i!=0){
                String n = inputText.substring(i,i+1);
                for(int j=0; j<inputText.length(); j++) {
                    if (inputText.substring(0, i).equals(inputText.substring(0, j))) {
                        countText++;
                    }
                }
                if(countText>mostCountedTextNum){
                    mostCountedTextNum = countText;

                }
            }
        }
        return mostCountedTextNum;
    }*/
    return stringMap;
    }
}

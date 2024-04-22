package Nov05;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        List<String> extractedNumList = new ArrayList<>();
        List<String> refinedNumList = new ArrayList<>();

        String StringA = String.valueOf(248);

        for (int i = 0; i < StringA.length(); i++) {
            extractedNumList.add(StringA.substring(i,i+1));
        }

        for(int i =0; i<extractedNumList.size(); i++){
            System.out.println("extractedNumList: "+extractedNumList.get(i));
           if(refinedNumList.size()==0){
               refinedNumList.add(extractedNumList.get(i));
           }else {
               for (int j = 0; j < refinedNumList.size(); j++) {
                   if (!extractedNumList.get(j).equals(refinedNumList.get(j))) {
                       refinedNumList.add(extractedNumList.get(j));
                   }
               }
           }
        }
        for(String currentNum : refinedNumList){
            System.out.println(currentNum);
        }


        int answer = 0;
        for (int i = 0; i < extractedNumList.size(); i++) {
            if(i==0){
                answer+=Integer.parseInt(extractedNumList.get(i));
            }else{
                answer += Integer.parseInt(extractedNumList.get(i)) * i * 10;
            }
        }
    }
}

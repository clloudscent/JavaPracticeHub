package jan26;

import java.util.HashMap;
import java.util.Map;

public class TextCount_ToCompare {
    public static void main(String[] args) {
        Map<String, Integer> textMap = new HashMap<>();
        String test = "applepieaweoifjqoiewfoixcjweuifhewiufcxvbnmxcvmxzcnbvsajkdfalsfhsjkdlfhasldkjfgshjkfqoweuiryusdypfoiuqwpoershdjfklshdjlkfhsalkjfhxzcbvnmxvbxmncvbshjkfgksadfjhqwoeiuyroweiuyfuisdyivucxvguyguysfdguyfagsuyaguyagaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaayefguwayfuyaewgfuyawefguaywefwebfvwnebfvayatwfeaywtewvwecbvwcefayataytafaaaaaaaaaa";

        String currentText = "";
        int count = 1; //4
        final int firstCount = 1;
        String mostCountedText = "";
        int mostCounted = 0;
        int calculationCount = 0;
        for(int i =0; i<test.length(); i++){
            currentText = test.substring(i,i+1);
//            System.out.println(currentText);
            if(!textMap.containsKey(currentText)){
                //처음등장한 currentText
                textMap.put(currentText, firstCount);
            }else{
                //중복되어 등장한 currentText
                count = textMap.get(currentText)+1;
                textMap.put(currentText, count);
            }

        }

        for(String currentChar : textMap.keySet()){
            calculationCount++;
            int currentCount = textMap.get(currentChar);
            if(mostCounted<currentCount){
                mostCounted = currentCount;
                mostCountedText = currentChar;
            }
        }

        System.out.println(mostCountedText + "," +mostCounted);
        System.out.println(calculationCount);
    }
}

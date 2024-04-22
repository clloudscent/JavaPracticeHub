package nov03;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    public static int solution(int[] A) {
        String convertedString = "";
        List<String> extractedStringList = new ArrayList<>();
        List<String> numberList = new ArrayList<>();
        for(int i =0; i<A.length; i++){
            int extractedInt = A[i];
            extractedStringList.add(convertedString = String.valueOf(extractedInt));
        }
        for(int i =0; i<convertedString.length(); i++){
            numberList.add(convertedString.substring(i,i+1));
        }

        for(int i =0; i<extractedStringList.size(); i++){
            for(int j =0; j<numberList.size(); j++){
                if(extractedStringList.get(i).substring(i).equals(numberList.get(j))){

                }
            }

        }

        return 1;
    }

    public static void main(String[] args) {
        //정답으로 -1 나와야함
        System.out.println(solution(new int[]{25, 35, 501, 256}));
        //정답으로 130나와야함
        System.out.println(solution(new int[]{77, 23, 37, 107}));

        //정답으로 15나와야함
        System.out.println(solution(new int[]{15, 0, 105}));
    }
}

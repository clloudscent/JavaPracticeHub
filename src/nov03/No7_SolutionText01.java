package nov03;

import java.util.ArrayList;
import java.util.List;

public class No7_SolutionText01 {
    public static void main(String[] args) {
        int[] A = {25, 35, 501, 256};

        List<String> extractedNumList = new ArrayList<>();
        extractedNumList.add(String.valueOf(A));

        //extractedNumList = ["25","35","501","256"];


        for(int num :A){
            extractedNumList.add(String.valueOf(num));
        }

        List<Integer> numList = new ArrayList<>();
        for(String currentStr : extractedNumList){
            numList.add(Integer.valueOf(currentStr));
        }

        //numList

        for(int currentIndex : numList){
            System.out.println(currentIndex);
        }
    }
}

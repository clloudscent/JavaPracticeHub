package nov03;

import java.util.ArrayList;
import java.util.List;


public class No8_SolutionText02 {
    public static void main(String[] args) {
        int[] A = {25, 35, 501, 256};
        List<String> extractedNumList = new ArrayList<>();

        for (int num : A) {
            extractedNumList.add(String.valueOf(num));
        }

        List<Integer> numList = new ArrayList<>();

        for (int num : A) {
            while (num > 0) {
                int digit = num % 10; // 맨 끝자리 숫자를 구함
                if (!numList.contains(digit)) {
                    numList.add(digit);
                }
                num = num / 10; // 맨 끝자리 숫자를 제거함
            }
        }

        for (int digit : numList) {
            System.out.println(digit);
        }
    }
}



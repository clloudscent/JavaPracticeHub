package Nov05;

import java.util.ArrayList;
import java.util.List;

public class ExtractNum {
    public static int solution(int A) {
        List<String> extractedNumList = new ArrayList<>();

        String StringA = String.valueOf(A);
        for (int i = 0; i < StringA.length(); i++) {
            for (int j = 0; j < extractedNumList.size(); j++) {
                if (!extractedNumList.get(j).equals(StringA.substring(i, i + 1))) {
                    extractedNumList.add(StringA.substring(i, i + 1));
                }
            }
        }

        int answer = 0;
        for (int i = 0; i < extractedNumList.size(); i++) {
            if(i==0){
                answer+=Integer.parseInt(extractedNumList.get(i));
            }else{
                answer += Integer.parseInt(extractedNumList.get(i)) * i * 10;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(428));
    }
}



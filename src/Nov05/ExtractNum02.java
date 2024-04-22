package Nov05;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExtractNum02 {
    public static int solution(int A) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        int count = 1;
        while(A!=0){
            int currentDigit = A%10; //뒤에서부터 자릿수 추출
            integerMap.put(currentDigit,count);

            A = A/10; //다음 자릿수로 넘어감
            count++;
        }
        int answer = 0;
        String temp = "";


        for(int currentNum : integerMap.keySet()){
            for(int i =0; i<String.valueOf(currentNum).length(); i++){
/*
                temp.substring(i,i+1)=String.valueOf(currentNum);
*/
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(428));
    }
}

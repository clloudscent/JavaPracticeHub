package Nov05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test02 {
    public static void main(String[] args) {
        int num = 42888;
        Map<Integer, Integer> integerMap = new HashMap<>();
        int count = 1;
        while(num!=0){
            int currentDigit = num%10; //뒤에서부터 자릿수 추출
            integerMap.put(currentDigit,count);

            num = num/10; //다음 자릿수로 넘어감
            count++;
        }

        for(int currentNum : integerMap.keySet()){
            System.out.println(currentNum);
        }
    }
}

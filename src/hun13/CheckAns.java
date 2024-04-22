package hun13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckAns {
    public static void main(String[] args) {
        List<Integer> ans = Arrays.asList(2, 9, 4);

        List<Integer> userNumList = Arrays.asList(4,9,5);
        int strike = 0;
        int ball = 0;

        for(int i=0; i<3;i++){
            int numToCheck = userNumList.get(i);
            //Strike Check
            if (numToCheck == ans.get(i)){
                strike++;
            }else{
                for(int j=0; j<3;j++){
                    if(numToCheck==ans.get(j)){
                        ball++;
                        break;
                    }
                }
            }
        }

        if(strike==3){
            System.out.println("정답입니다.");
        }else if(strike==0&&ball==0){
            System.out.println("아웃 입니다.");
        }else{
            System.out.println(strike+"스트라이크 "+ball+"볼 입니다.");
        }

    }
}

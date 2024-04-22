package hun13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RandomPractice {
    public static void main(String[] args) {
        List<Integer> ans = new ArrayList<>();
        while(ans.size()<3){
            int randomNum = ((int)(Math.random()*9))+1;
            boolean isNumExist = false;
            for(int i=0; i<ans.size();i++){
                if(ans.get(i).equals(randomNum)){
                    isNumExist = true;
                    break;
                }
            }
            if(!isNumExist){
                ans.add(randomNum);
            }
        }
        System.out.println(ans);

        Scanner sc = new Scanner(System.in);
        while(true) {
            List<Integer> userNumList = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                System.out.print("수를 입력해주세요: ");
                int userNum = sc.nextInt();
                userNumList.add(userNum);
            }
            System.out.println(userNumList);

            int strike = 0;
            int ball = 0;

            for (int i = 0; i < 3; i++) {
                int numToCheck = userNumList.get(i);
                //Strike Check
                if (numToCheck == ans.get(i)) {
                    strike++;
                } else {
                    for (int j = 0; j < 3; j++) {
                        if (numToCheck == ans.get(j)) {
                            ball++;
                            break;
                        }
                    }
                }
            }

            if (strike == 3) {
                System.out.println("정답입니다.");
                break;
            } else if (strike == 0 && ball == 0) {
                System.out.println("아웃 입니다.");
            } else {
                System.out.println(strike + "스트라이크 " + ball + "볼 입니다.");
            }
        }
    }
}

package may27;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sushi {
    public static void main(String[] args) {
        Map<String, String> inputMap = new HashMap<>();
        Map<String, Integer> sushiCountMap = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <= 5; i++) {
            System.out.print("사용자이름:");
            String name = sc.nextLine();
            System.out.print("좋아하는초밥:");
            String sushi = sc.nextLine();

            inputMap.put(name, sushi);

            System.out.println(inputMap);




        }



        for (String voterName : inputMap.keySet()) {
            String currentSushi = inputMap.get(voterName);
            if (sushiCountMap.containsKey(currentSushi)) {

                sushiCountMap.put(currentSushi, sushiCountMap.get(currentSushi) + 1);
            } else {
                sushiCountMap.put(currentSushi, 1);
            }
        }

        int mostCounted = 0;

        String mostSelectedSushi = "";
        for(String currentSushi : sushiCountMap.keySet()){
            if(mostCounted<sushiCountMap.get(currentSushi)){
                mostCounted = sushiCountMap.get(currentSushi);
                mostSelectedSushi = currentSushi;
            }

        }
        System.out.println("가장많이 선택된 초밥:"+mostSelectedSushi);

        System.out.println(mostSelectedSushi+"를 선택한 사람:");
        for(String voterName : inputMap.keySet()){
            if(inputMap.get(voterName).equals(mostSelectedSushi)){
                System.out.println(voterName);
            }
        }
    }
}




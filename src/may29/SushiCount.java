package may29;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SushiCount {
    public static void main(String[] args) {
        Map<String, String> inputMap = new HashMap<>();
        Map<String, Integer> sushiCountMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        /*for(int i = 0; i<5; i++){
            System.out.print("사용자:");
            String user = sc.nextLine();
            System.out.print("초밥: ");
            String sushi = sc.nextLine();
            inputMap.put(user, sushi);
        }*/
        inputMap.put("철수", "계란초밥");
        inputMap.put("짱구", "계란초밥");
        inputMap.put("영희", "계란초밥");
        inputMap.put("맹구", "참치초밥");
        inputMap.put("훈이", "연어초밥");

        for (String voterName : inputMap.keySet()) {
            String currentSushi = inputMap.get(voterName);
            if (sushiCountMap.containsKey(currentSushi)) {
                sushiCountMap.put(currentSushi, sushiCountMap.get(currentSushi) + 1);
            } else if (!sushiCountMap.containsKey(currentSushi)) {
                sushiCountMap.put(currentSushi, 1);
            }
        }

        int count = 0;


        boolean isRunnable = true;
        while (isRunnable) {
            int mostCounted = 0;
            String mostCountedSushi = "";
            if (sushiCountMap.isEmpty()) {
                isRunnable = false;
            }

            for (String currentSushi : sushiCountMap.keySet()) {
                if (mostCounted < sushiCountMap.get(currentSushi)) {
                    mostCounted = sushiCountMap.get(currentSushi);
                    mostCountedSushi = currentSushi;
                }
            }

            count++;


            System.out.print(mostCountedSushi + ", " + sushiCountMap.get(mostCountedSushi) + "회 ");

            for (String currentVoter : inputMap.keySet()) {

                if (inputMap.get(currentVoter).equals(mostCountedSushi)) {
                    System.out.print(","+currentVoter);
                }
            }
            System.out.println(" ");
            sushiCountMap.remove(mostCountedSushi);
            if (sushiCountMap.isEmpty()) {
                isRunnable = false;
            }
//            isRunnable = false;

        }
    }
}


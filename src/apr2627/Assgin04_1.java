package apr2627;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Assgin04_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> voteMap = new HashMap<>();
        boolean isRunnable = true;

        while(isRunnable){
            System.out.println("좋아하는 초밥:");
            System.out.println("종료하기는 e");
            String input = sc.nextLine();
            if(input.equals("e")){
                isRunnable = false;
                break;
            }
            if(voteMap.get(input)==null){
                voteMap.put(input,1);
            }else{
                voteMap.put(input, voteMap.get(input)+1);
            }
        }

        System.out.println(voteMap);

        //가장많이 투표받은 초밥, 그 초밥이 받은 투표수
        int mostVoted = 0;
        String mostVotedSushi = "";

        for(Map.Entry<String, Integer> sushi : voteMap.entrySet()){
            String currentSushi = sushi.getKey();
            int voted = sushi.getValue();

            if(voted>mostVoted){
                mostVoted = voted;
                mostVotedSushi = currentSushi;
            }
        }

        System.out.println(mostVotedSushi+","+mostVoted);
    }
}

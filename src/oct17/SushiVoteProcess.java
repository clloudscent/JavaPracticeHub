package oct17;

import java.util.ArrayList;
import java.util.Scanner;

public class SushiVoteProcess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SushiVote> voteList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            SushiVote sv = new SushiVote();
            System.out.print("투표자이름: ");
            String name = sc.nextLine();
            System.out.print("초밥명: ");
            String sushi = sc.nextLine();
            sv.voter = name;
            sv.sushiName = sushi;
            voteList.add(sv);
        }

        ArrayList<ResultCount> resultList = new ArrayList<>();
        //초밥별 투표수
        for (int i = 0; i < voteList.size(); i++) {
            String currentSushiName = voteList.get(i).sushiName; //연어초밥
            boolean found = false;

            for (int j = 1; j < resultList.size(); j++) {
                //list를 돌면서 현재 초밥이 있는지 확인
                if (resultList.get(j).sushi.equals(currentSushiName)) {
                    resultList.get(j).count++;
                    found = true;
                    break;
                }
            }

            //resultList에 초밥이 없다면 추가
            if (found == false) {
                ResultCount rc = new ResultCount();
                rc.sushi = currentSushiName;
                rc.count = 1;
                resultList.add(rc);
            }
        }

        for (int i = 0; i < resultList.size() - 1; i++) {
            for (int j = 0; j < resultList.size() - i - 1; j++) {
                if (resultList.get(j).count < resultList.get(j + 1).count) {
                    ResultCount temp = resultList.get(j);
                    resultList.set(j, resultList.get(j + 1));
                    resultList.set(j + 1, temp);
                }
            }
        }

        for(int i = 0; i<resultList.size(); i++){
            System.out.println(resultList.get(i).sushi);
            System.out.println(resultList.get(i).count);
        }
    }
}


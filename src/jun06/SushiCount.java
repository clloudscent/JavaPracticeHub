package jun06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SushiCount {
    public static void main(String[] args) {
        //SushiInfo 객체 안에 초밥이름, 투표횟수, 투표자 이름목록에 대한 객체가 담겨있음
        //voteResult 에는 투표자이름과 초밥이름 정보가 담김
        ArrayList<SushiInfo> voteResult = new ArrayList<>();
        //5명에게 이름과 초밥을 입력받고 결과가 voteResult 에 담김
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            SushiInfo sushiInfo = new SushiInfo();
            System.out.print("사용자이름: ");
            String voterName = sc.nextLine();
            System.out.print("스시이름: ");
            String sushiName = sc.nextLine();

            sushiInfo.setVoterName(voterName);
            sushiInfo.setSushiName(sushiName);

            voteResult.add(sushiInfo);
        }

        //sushiRank Map 에 초밥과 초밥의 투표받은 수를 넣음

        Map<String, Integer> sushiRank = new HashMap<>();

        for (int i = 0; i < voteResult.size(); i++) {
            String currentSushiInList = voteResult.get(i).sushiName;
            if (!sushiRank.containsKey(currentSushiInList)) {
                sushiRank.put(currentSushiInList, 1);
            }else{
                sushiRank.put(currentSushiInList, sushiRank.get(currentSushiInList)+1);
            }
        }

        //가장 많이 선택받은 초밥 순으로 정렬하기 Map 을 List 로 바꾸기
        //새로운 리스트를 만들고 해당 리스트에 초밥이름, 투표 수가 담김
        ArrayList<SushiInfo> resultList = new ArrayList<>();
        for(String currentSushi : sushiRank.keySet()){
            SushiInfo sushiInfo = new SushiInfo();
            String sushiName = currentSushi;
            int sushiCount = sushiRank.get(currentSushi);

            sushiInfo.setSushiName(sushiName);
            sushiInfo.setVoteCount(sushiCount);

            resultList.add(sushiInfo);
        }



        //버블정렬로 voteCount 가 높은 순서대로 출력
        for(int i =0; i<resultList.size(); i++){
            for(int j =0; j<resultList.size()-i-1; j++){
                if(resultList.get(j).voteCount<resultList.get(j+1).voteCount){
                    SushiInfo temp = resultList.get(j);
                    resultList.set(j,resultList.get(j+1));
                    resultList.set(j+1, temp);
                }
            }
        }
        System.out.println(resultList);

        for(int i=0; i<resultList.size(); i++){
            String currentSushi = resultList.get(i).sushiName;//계란초밥
            System.out.print(resultList.get(i).sushiName+","+resultList.get(i).voteCount+"회");
            for(int j =0; j<voteResult.size(); j++){
                if(voteResult.get(j).sushiName.equals(currentSushi)){
                    System.out.print(","+voteResult.get(j).voterName);
                }
            }
            System.out.println(" ");
        }
    }
}


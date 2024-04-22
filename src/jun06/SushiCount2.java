package jun06;

import may27.Sushi;

import java.util.*;

public class SushiCount2 {
    public static void main(String[] args) {
        //SushiInfo 객체 안에 초밥이름, 투표횟수, 투표자 이름목록에 대한 객체가 담겨있음
        //voteResult 에는 투표자이름과 초밥이름 정보가 담김
        ArrayList<VoteInfo> voteResult = new ArrayList<>();
        //5명에게 이름과 초밥을 입력받고 결과가 voteResult 에 담김
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            VoteInfo voteInfo = new VoteInfo();
            System.out.print("사용자이름: ");
            String voterName = sc.nextLine();
            System.out.print("스시이름: ");
            String sushiName = sc.nextLine();

            voteInfo.setVoterName(voterName);
            voteInfo.setVotedSushiName(sushiName);

            voteResult.add(voteInfo);
        }

        //sushiRank Map 에 초밥과 초밥의 투표받은 수를 넣음

        Map<String, SushiInfo2> sushiRank = new HashMap<>();

        for (int i = 0; i < voteResult.size(); i++) {
            String currentSushiInList = voteResult.get(i).getVotedSushiName();
            String voterName = voteResult.get(i).getVoterName();
            if (!sushiRank.containsKey(currentSushiInList)) {
                SushiInfo2 sushiInfo = new SushiInfo2();
                sushiInfo.setSushiName(currentSushiInList);
                sushiInfo.setVotedNum(1);
                List<String> voterNameList = sushiInfo.getVoterNameList();
                voterNameList.add(voterName);

                sushiRank.put(currentSushiInList, sushiInfo);
            }else{
                SushiInfo2 sushiInfo2 = sushiRank.get(currentSushiInList);
                sushiInfo2.setVotedNum(sushiInfo2.getVotedNum()+1);
                List<String> voterNameList = sushiInfo2.getVoterNameList();
                voterNameList.add(voterName);

            }
        }

        //가장 많이 선택받은 초밥 순으로 정렬하기 Map 을 List 로 바꾸기
        //새로운 리스트를 만들고 해당 리스트에 초밥이름, 투표 수가 담김
        ArrayList<SushiInfo2> resultList = new ArrayList<>();
        for(String currentSushi : sushiRank.keySet()){

            resultList.add(sushiRank.get(currentSushi));
        }



        //버블정렬로 voteCount 가 높은 순서대로 출력
        for(int i =0; i<resultList.size(); i++){
            for(int j =0; j<resultList.size()-i-1; j++){
                if(resultList.get(j).getVotedNum()<resultList.get(j+1).getVotedNum()){
                    SushiInfo2 temp = resultList.get(j);
                    resultList.set(j,resultList.get(j+1));
                    resultList.set(j+1, temp);
                }
            }
        }
//        System.out.println(resultList);

        for(int i=0; i<resultList.size(); i++){
            System.out.println(resultList.get(i));
        }
    }
}


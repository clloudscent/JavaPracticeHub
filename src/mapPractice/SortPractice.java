package mapPractice;

import java.util.ArrayList;
import java.util.List;

public class SortPractice {
    public static void main(String[] args) {
        List<Integer> scoreList = new ArrayList<>();
        scoreList.add(90);
        scoreList.add(60);
        scoreList.add(55);
        scoreList.add(13);
        scoreList.add(70);
        scoreList.add(80);
        scoreList.add(91);

        for(int i=0; i<scoreList.size()-1; i++){
            for(int j=i+1; j<scoreList.size(); j++){
                if(scoreList.get(i)>scoreList.get(j)){
                    int temp = scoreList.get(i);
                    scoreList.set(i, scoreList.get(j));
                    scoreList.set(j, temp);
                }
            }
        }
        System.out.println(scoreList);
    }
}

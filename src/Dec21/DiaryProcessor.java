package Dec21;

import java.security.Key;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiaryProcessor {
    String extract(List<DiaryVO> diaryVOList){
        String mostCountedName = "";
        int mostCounted = 0;
        for(int i=0; i<diaryVOList.size(); i++){
            String currentName = diaryVOList.get(i).getWriter();
            int currentCount = 0;

            if(!mostCountedName.equals(currentName)){
                //for문돌면서 currentName이랑 diaryVO.List Writer와 일치할 시 currentCount ++
                for(int j =0; j<diaryVOList.size(); j++){
                    if(currentName.equals(diaryVOList.get(i).getWriter())){
                        currentCount++;
                    }
                }
            }
            if(currentCount>mostCounted){
                mostCountedName = currentName;
                mostCounted = currentCount;
            }
        }
        return mostCountedName;
    }


    public String extractWithMap(List<DiaryVO> diaryList){
        //diaryList의 Writer를 Map형태로 추출해야한다.
        //Map에는 key로는 Writer를, value로는 Writer가 쓴 게시물의 수를 저장해야한다.
        //diaryList를 전부 돌면서, Writer를 가져오고, 가져올때마다 해당 Writer의 count값을 1씩 증가시키고,
        //리스트를 전부돌면 count값을 value로 저장한다.


        Map<String, Integer> diaryMap = new HashMap<>();
        int count = 0;
        String currentWriter = "";

//        for(DiaryVO currentDiary : diaryList){
//            currentWriter = currentDiary.getWriter();
//            if(diaryMap.containsKey(currentDiary)){
//                diaryMap.put(currentWriter, diaryMap.get(currentWriter)+1);
//            }else{
//                diaryMap.put(currentWriter, 1);
//            }
//        }

        for(int i =0; i<diaryList.size(); i++){
           currentWriter = diaryList.get(i).getWriter();
           if(diaryMap.containsKey(currentWriter)){
             diaryMap.put(currentWriter, diaryMap.get(currentWriter)+1);
           }else{
               diaryMap.put(currentWriter, 1);
           }
        }

        String mostCountedName = "";
        int mostCounted = 0;
        for(Map.Entry<String, Integer> currentEntry : diaryMap.entrySet()){
            if(currentEntry.getValue()>mostCounted){
                mostCounted = currentEntry.getValue();
                mostCountedName = currentEntry.getKey();
            }
        }
        return mostCountedName;
    }
}

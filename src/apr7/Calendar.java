package apr7;

import java.util.ArrayList;
import java.util.List;

public class Calendar {
    List<String> dateList = new ArrayList<>();
    List<String> eventList = new ArrayList<>();

    public void addDateAndEvent(String dateAndEventString){
        String eventString = "";
        String dateString = "";
        for(int i=0; i<dateAndEventString.length(); i++){
            try{
                Integer.parseInt(dateAndEventString.substring(i,i+1));
                dateString = dateString + dateAndEventString.substring(i,i+1);
            }catch (Exception e){
                eventString = eventString + dateAndEventString.substring(i,i+1);
            }
        }
        dateList.add(dateString);
        eventList.add(eventString);
    }

    public String searchEvent(String dateString){
        String result = "";
        boolean isAdded = false;
        int addedIndex = 0;
        for(int i=0; i<dateList.size(); i++){
            if(dateString.equals(dateList.get(i))){
                isAdded = true;
                addedIndex = i;
                break;
            }
        }
        if(isAdded){
            result = dateList.get(addedIndex).substring(0,2)+"월"+dateList.get(addedIndex).substring(2)+"일"+":"+eventList.get(addedIndex);
        }else{
            result = dateString.substring(0,2)+"월"+dateString.substring(2)+"일"+":"+"아직 일정이 추가되지 않았습니다.";
        }

        return result;
    }
}

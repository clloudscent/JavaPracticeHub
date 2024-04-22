package apr6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calendar {
    //0822생일
    //0101신년
    //1225크리스마스
    //1111빼빼로데이

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> dateList = new ArrayList<>();
        List<String> eventList = new ArrayList<>();
        boolean isRunnable = true;
        while (isRunnable) {
            separation(inputEvent(), dateList, eventList);
            System.out.println(dateList);
            System.out.println(eventList);
            if(inputEvent().equals("=")){
                isRunnable=false;
            }
        }
        String input = "";
        while(isRunnable==false){
            System.out.print("검색:");
             input = sc.nextLine();
             searchEvent(input, dateList, eventList);
            if(inputEvent().equals("=")){
                isRunnable=true;
            }
        }



    }

    static String inputEvent(){
        Scanner sc = new Scanner(System.in);
        String inputEvent = sc.nextLine();
        return inputEvent;
    }

    static void separation(String input, List<String> dateList, List<String> eventList){
        String eventString = "";
        String dateString = "";
        for(int i=0; i<input.length(); i++){
            try{
                Integer.parseInt(input.substring(i,i+1));
                dateString = dateString + input.substring(i,i+1);
            }catch (Exception e){
                eventString = eventString + input.substring(i,i+1);
            }
        }
        dateList.add(dateString);
        eventList.add(eventString);
    }
    static void searchEvent(String inputDate, List<String> dateList, List<String> eventList){
        for(int i=0; i<dateList.size(); i++){
            if(inputDate.equals(dateList.get(i))){
                System.out.println(dateList.get(i).substring(0,2)+"월"+dateList.get(i).substring(2)+"일"+":"+eventList.get(i));
            }else{
                System.out.println(inputDate.substring(0,2)+"월"+inputDate.substring(2)+"일"+":"+"아직 일정이 추가되지 않았습니다.");
            }
        }
    }
}

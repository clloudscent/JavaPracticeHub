package oct26;

import java.util.ArrayList;
import java.util.Scanner;

public class SushiProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> sushiList = new ArrayList<>();
        for(int i =0; i<5; i++){
            String userInput = sc.nextLine();
            sushiList.add(userInput);
        }
        boolean isExist = false;


        for(String currentSushi : sushiList){
            if(currentSushi.equals("연어초밥")){
                isExist = true;
            }
        }
        if(isExist){
            System.out.println("연어초밥이 리스트에 담겨 있습니다.");

            for(int i =0; i<sushiList.size(); i++){
                if(sushiList.get(i).equals("연어초밥")){
                    sushiList.set(i, "맛있는초밥");
                }
            }
        }else{
            System.out.println("연어초밥이 리스트에 담겨있지 않습니다..");
            System.out.println("연어초밥추가");
            sushiList.add("연어초밥");
            System.out.println("추가완료");
        }

        for(String currentSushi : sushiList){
            System.out.println(currentSushi);
        }
    }
}

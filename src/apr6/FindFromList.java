package apr6;

import java.util.Arrays;
import java.util.List;

public class FindFromList {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("홍길동", "임꺽정", "둘리", "희동이", "호날두", "메시", "즐라탄", "히딩크");

        String targetName = "짱구";
        boolean isFound = false;

        for(int i=0; i<nameList.size(); i++){
            if(nameList.get(i).equals(targetName)){
                isFound = true;
                break;
            }
        }

        if(isFound==true){
            System.out.println("찾았습니다");
        }else{
            System.out.println("찾지못했습니다.");
        }
    }
}

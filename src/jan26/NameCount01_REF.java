package jan26;

import java.util.*;

public class NameCount01_REF {
    public static void main(String[] args) {
        Map<String, String> userSushi = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        String name = "";
        String sushsi = "";
        /*for(int i=0; i<5; i++){
            System.out.print("이름: ");
            name = sc.nextLine();
            userList.add(name);
            System.out.print("좋아하는 초밥: ");
            sushsi = sc.nextLine();
            sushiList.add(sushsi);
        }*/
        userSushi.put("짱구", "연어초밥");
        userSushi.put("훈이", "참치초밥");
        userSushi.put("맹구", "광어초밥");
        userSushi.put("철수", "계란초밥");
        userSushi.put("유리", "연어초밥");

        System.out.println(userSushi);

        //Map<사용자이름, 초밥이름>의 맵으로부터 <초밥이름, 나온횟수>형태의 맵을 만들어내는 부분
        Map<String, Integer> sushiCount = new HashMap<>();
        for(String currentName : userSushi.keySet()){
            String sushiName = userSushi.get(currentName);
            if(sushiCount.containsKey(sushiName)){
                int currentCount = sushiCount.get(sushiName)+1;
                sushiCount.put(sushiName, currentCount);
            }else{
                sushiCount.put(sushiName, 1);
            }
        }
        System.out.println(sushiCount);

        int mostCounted = 0;
        String mostCountedName = "";
        for(String currentSushi : sushiCount.keySet()){
            int currentCount = sushiCount.get(currentSushi);
            if(currentCount>mostCounted){
                mostCountedName = currentSushi;
                mostCounted = currentCount;
            }
        }
        System.out.println(mostCountedName+", "+mostCounted);






        //가장많이나온초밥을 선택한 사용자이름
    }
}

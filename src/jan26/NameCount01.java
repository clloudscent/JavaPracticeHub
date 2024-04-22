package jan26;

import java.util.*;

public class NameCount01 {
    public static void main(String[] args) {
        List<String> userList = new ArrayList<>();
        List<String> sushiList = new ArrayList<>();
        List<String> nameList = new ArrayList<>();
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

        userList.add("짱구");
        sushiList.add("연어초밥");
        userList.add("훈이");
        sushiList.add("참치초밥");
        userList.add("맹구");
        sushiList.add("광어초밥");
        userList.add("철수");
        sushiList.add("계란초밥");
        userList.add("유리");
        sushiList.add("연어초밥");


        System.out.println(userList);
        System.out.println(sushiList);

        Map<String,Integer> userMap = new HashMap<>();

        int count = 0;
        final int firstCount = 1;
        int mostCounted = 0;
        String mostCountedSushi = "";
        String mostCountedName = "";
        //가장많이나온초밥
        for(int i=0; i<userList.size(); i++){
            if(!userMap.containsKey(sushiList.get(i))){
                userMap.put(sushiList.get(i), firstCount);
            }
            if(userMap.containsKey(sushiList.get(i))){
                userMap.put(sushiList.get(i), userMap.get(sushiList.get(i))+1);
            }
            if(mostCounted<userMap.get(sushiList.get(i))){
                mostCountedSushi = sushiList.get(i);
                mostCountedName = userList.get(i);
                nameList.add(mostCountedName);
            }
        }
        System.out.println(mostCountedSushi);
        System.out.println(nameList);

        //가장많이나온초밥을 선택한 사용자이름
    }
}

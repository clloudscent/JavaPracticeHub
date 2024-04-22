package nameCount3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NameCount2_Practice {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("홍길동");
        nameList.add("임꺽정");
        nameList.add("홍둘리");
        nameList.add("홍상희");
        nameList.add("손흥민");
        nameList.add("손둘리");
        nameList.add("호날두");
        nameList.add("메시");
        nameList.add("즐라탄");
        nameList.add("호날두");
        nameList.add("호날두");
        nameList.add("즐라탄");
        nameList.add("홍길동");

        String name = null;
        for(int i=0; i< nameList.size();i++){
            name = nameList.get(i);
        }

        List<String> refinedList = new ArrayList<>();
        refinedList.add(name);

    }
}

package jan26;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<String, String> testMap = new HashMap<>();
        Map<String, String> testMap2 = new HashMap<>();
        testMap.put("연어초밥", "짱구");
        testMap.put("연어초밥", "유리");

        System.out.println(testMap);
        testMap2.put("짱구", "연어초밥");
        testMap2.put("유리", "연어초밥");
        //map.get(이름) 해서 나온 value값이 중복되면 count++
    }
}

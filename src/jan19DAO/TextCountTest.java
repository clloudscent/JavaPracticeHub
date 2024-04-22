package jan19DAO;

import java.util.HashMap;
import java.util.Map;

public class TextCountTest {
    public static void main(String[] args) {
        TextCount textCount = new TextCount();
        String n = "apple";
        System.out.println(textCount.mostCountedText(n));
        String a = "apple";
        int b= 1;
        int c = 2;
        /*System.out.println(a.length());
        System.out.println(a.substring(4,5));*/
        Map<String, Integer> tempMap = new HashMap<>();
        tempMap.put(a, b);
        tempMap.put(a,c);
        tempMap.put(a,b);
        System.out.println(tempMap);
    }
}

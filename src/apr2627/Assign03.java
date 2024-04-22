package apr2627;

import java.util.*;

public class Assign03 {
    public static void main(String[] args) {
        HashMap<String, Integer> cityMap = new HashMap<>();
        cityMap.put("tokyo",100);
        cityMap.put("seoul",50);
        cityMap.put("newyork",200);

        List<String> cities = new ArrayList<>(cityMap.keySet());
        Collections.sort(cities);

        for(String cityName : cities){
            int population = cityMap.get(cityName);
            System.out.println(cityName+":"+population);
        }

    }

}

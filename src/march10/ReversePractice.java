package march10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReversePractice {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(intList);

        List<Integer> reversedList = new ArrayList<>();
        for(int i = intList.size()-1; i>=0 ; i--){
            System.out.println("i: "+i+", intList.get(i): "+intList.get(i));
            reversedList.add(intList.get(i));
        }

        System.out.println(reversedList);

    }
}

package apr2627;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Assign01 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        Collections.sort(arr, Collections.reverseOrder());

        for(int i=0; i<arr.size(); i++){
            System.out.println(i);
        }
    }
}

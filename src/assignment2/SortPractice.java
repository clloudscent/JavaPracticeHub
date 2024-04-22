package assignment2;

import java.util.ArrayList;
import java.util.List;

public class SortPractice {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(42);
        arr.add(15);
        arr.add(2);
        arr.add(92);

        for(int i =0; i<arr.size()-1; i++){
            for(int j=0; j<arr.size()-i-1; j++){
                if(arr.get(j)<arr.get(j+1)){
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, temp);
                }
            }
        }

        for(Integer num:arr){
            System.out.println(num);
        }
    }

}

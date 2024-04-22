package assignment2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Num01 {
    //{3,1,2,2,3,4,5,6,6}
    public static void main(String[] args) {
        //ㅂㅐ열
        int[] array = {3,1,2,2,3,4,5,6,6,1};
        ArrayList<Integer> arr = new ArrayList<>();

        Set<Integer> set = new HashSet<Integer>();

        for(int i =0; i<array.length; i++){
            set.add(array[i]);
        }

        for(int i:set){
            arr.add(i);
        }
        //1,3,2,5
        for(int i =0; i<arr.size()-1; i++){
            for(int j=0; j<arr.size()-i-1; j++){
                int temp = arr.get(j);
                arr.set(j, arr.get(j+1));
                arr.set(j+1, temp);
            }
        }
        for(int i =0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }
}

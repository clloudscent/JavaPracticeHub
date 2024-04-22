package apr2627;

import java.util.ArrayList;

public class Assign01_01 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        int temp;
        for(int i=0; i<arr.size(); i++){
            for(int j= i+1; j<arr.size(); j++){
                if(arr.get(i)>arr.get(j)){
                    temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
        for(int i =0; i<arr.size(); i++){
            System.out.println(i);
        }
    }
}

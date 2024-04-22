package nameCount2;

import java.util.ArrayList;
import java.util.List;

public class Ordering {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(4);
        numList.add(5);
        numList.add(1);
        numList.add(22);
        numList.add(3);
        numList.add(90);
        numList.add(16);
        int temp;

        for(int i= 0; i<numList.size(); i++){
            for(int j=0; j<numList.size(); j++){
              if(numList.get(i)<numList.get(j)){
                  temp = numList.get(i);
                  numList.set(i, numList.get(j));
                  numList.set(j, temp);
              }
            }
        }
        System.out.println(numList);
    }
}

package nov03;

import java.util.ArrayList;
import java.util.List;

public class No4_ExtractNum {
    public static List<String> separate(int A){
        List<String> numList = new ArrayList<>();
        String AtoString = String.valueOf(A);

        for(int i =0; i<AtoString.length(); i++){
            numList.add(AtoString.substring(i,i+1));
        }
        return numList;
    }
    public static void main(String[] args) {
        int A = 4917;
        System.out.println(separate(A));
    }
}

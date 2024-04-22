package march2;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();

        for(int i=0; i<5; i++){
            System.out.print("번호: ");
            int inputNum = sc.nextInt();
            numList.add(inputNum);
        }
        //5 3 2 1 4
        for(int i=0; i<numList.size()-1; i++){
            for(int j=i+1; j<numList.size(); j++){
                if(numList.get(i)>numList.get(j)){
                    int temp = numList.get(i);
                    numList.set(i, numList.get(j));
                    numList.set(j, temp);
                }
            }
        }

        System.out.println(numList);
    }
}

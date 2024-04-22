package assignment2;

import java.util.Arrays;

public class ArraySortPractice {
    public static void main(String[] args) {
        int[] intArray = new int[10];

        intArray[0] = 23;
        intArray[1] = 10;
        intArray[2] = 3;

        Arrays.sort(intArray);

        for(int i=0; i<intArray.length;i++){
            System.out.println(intArray[i]);
        }

    }
}

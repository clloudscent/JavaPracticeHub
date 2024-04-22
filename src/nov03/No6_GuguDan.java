package nov03;

import java.util.Arrays;

public class No6_GuguDan {
    //https://keichee.tistory.com/423e
    public static void main(String[] args) {
        int[][] array = new int[8][9];

        for(int i=2; i<10; i++){
            for(int j=1; j<10; j++){
                array[i-2][j-1] = i*j;
            }
        }

        for(int i =0; i<array.length; i++){
            System.out.print((i+2)+"단: ");
            System.out.print(Arrays.toString(array[i]));
            System.out.println();
        }
    }
}

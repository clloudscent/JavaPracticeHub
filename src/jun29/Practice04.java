package jun29;

import java.util.Scanner;

public class Practice04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] scores = new int[3][][];
        scores[0] = new int[2][3];
        scores[1] = new int[3][3];
        scores[2] = new int[2][3];
        int score = 0;

        for(int i =0; i<3; i++){
            int scoreSum = 0;
            for(int j=0; j<scores[i].length; j++){
                for(int k=0; k<scores[i][j].length; k++){

                    System.out.print((i+1)+"학년"+(j+1)+"반"+(k+1)+"번"+":");
                    score = sc.nextInt();
                    System.out.println(score+"점");
                    scoreSum+=score;
                    System.out.println("scoreSum:"+scoreSum);
                }
            }
        }


    }
}

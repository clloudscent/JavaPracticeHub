package jun29;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] classScores = new int[3][5];
        int score = 0;
        int avgSum = 0;
        for(int i = 0; i<classScores.length; i++){
            System.out.println((i+1)+"반: ");
            int classTotal = 0;
            for(int j = 0; j<classScores[i].length; j++){
                score = sc.nextInt();
                classScores[i][j] = score;
                classTotal+=classScores[i][j];
            }
            int classAvg = classTotal/5;
            System.out.println(classAvg);
            avgSum += classAvg;
        }
        int totalAvg = avgSum/3;
        System.out.println(totalAvg);
    }
}

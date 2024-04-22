package jun29;

import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] scores = new int[3][];
        scores[0] = new int[5];
        scores[1] = new int[3];
        scores[2] = new int[6];

        int totalSum = 0;
        int classAvg = 0;
        int totalAvg =0;
        int totalStudent = 0;
        for(int i =0; i<scores.length; i++){
            int classScoreSum = 0;
            for(int j =0; j<scores[i].length; j++){
                totalStudent++;
                System.out.print((i+1)+"반 "+(j+1)+"번 학생 수학점수: ");
                int score = sc.nextInt();
                scores[i][j] = score;
                classScoreSum+= scores[i][j];
//                System.out.println(classScoreSum);
            }
            totalSum += classScoreSum;
//            System.out.println("totalSum"+totalSum);
            classAvg = classScoreSum/scores[i].length;
            System.out.println("Class Average Score: "+classAvg);
        }
        totalAvg = totalSum/totalStudent;
        System.out.println("Total Student Average Score: "+totalAvg);

    }
}

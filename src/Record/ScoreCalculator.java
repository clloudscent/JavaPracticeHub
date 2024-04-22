package Record;

import java.util.Scanner;

public class ScoreCalculator {
    public static int calculateAvg(){
        Scanner sc = new Scanner(System.in);
        System.out.println("학생 수 입력: ");
        int amountOfStudent = sc.nextInt();
        int sum = 0;
        for(int i=0; i<amountOfStudent; i++){
            int score = sc.nextInt();
            sum += score;
        }
        int avg = sum/amountOfStudent;
        System.out.println(avg);
        return avg;
    }
}

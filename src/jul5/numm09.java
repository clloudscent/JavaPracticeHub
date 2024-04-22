package jul5;

import java.util.Scanner;

public class numm09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isRunnable = true;
        int[] scores = new int[0];
        while (isRunnable) {
            System.out.println("1.학생수,2.점수입력,3.점수리스트,4.분석,5.종료");
            System.out.print("선택>");
            int inputNum = sc.nextInt();
            switch (inputNum) {
                case 1:
                    System.out.print("학생수:");
                    int studentNum = sc.nextInt();
                    scores = new int[studentNum];
                    System.out.println(scores.length);
                    break;
                case 2:
                    for (int i = 0; i < scores.length; i++) {
                        System.out.print("scores[" + i + "]:");
                        scores[i] = sc.nextInt();
                    }
                    break;
                case 3:
                    for (int i = 0; i < scores.length; i++) {
                        System.out.println("scores[" + i + "]:" + scores[i]);
//                        System.out.print("scores["+i+"]:");
//                        System.out.print(scores[i]);
//                        System.out.println("");
                    }
                    break;
                case 4:
                    int highestScore = 0;
                    int studentCount = scores.length;
                    int sum = 0;
                    double avg = 0.0;
                    for (int currentScore : scores) {
                        sum += currentScore;
                        if (highestScore < currentScore) {
                            highestScore = currentScore;
                        }
                    }
                    avg = (double) sum / studentCount;
                    System.out.println("최고점수: " + highestScore);
//                    System.out.println(highestScore);
                    System.out.println("평균점수: " + avg);
//                    System.out.println(avg);

                    break;
                case 5:
                    System.out.println("프로그램 종료");
                    isRunnable = false;
                    break;
            }
        }
    }
}

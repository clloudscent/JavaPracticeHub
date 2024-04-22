/*
package hun13;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BaseballGame {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> answer = new ArrayList<>();

        while () {
            int num = random.nextInt(9) + 1;
            if (!answer.contains(num)) {
                answer.add(num);
            }
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            ArrayList<Integer> guess = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                guess.add(scanner.nextInt());
            }

            int strikes = 0, balls = 0;

            for (int i = 0; i < 3; i++) {
                if (answer.get(i) == guess.get(i)) {
                    strikes++;
                } else if (answer.contains(guess.get(i))) {
                    balls++;
                }
            }

            if (strikes == 3) {
                System.out.println("이겼습니다." + answer);
                break;
            } else if (strikes == 0 && balls == 0) {
                System.out.println("아웃!");
            } else {
                System.out.println(strikes + " 스트라이크, " + balls + " 볼");
            }
        }
        scanner.close();
    }
}
*/

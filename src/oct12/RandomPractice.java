package oct12;

import java.util.Random;

public class RandomPractice {
    public static void main(String[] args) {
        Random random = new Random();
        for(int i=0;i<200;i++){

            int randomNum = random.nextInt(45);
            System.out.println(randomNum);
        }
    }
}

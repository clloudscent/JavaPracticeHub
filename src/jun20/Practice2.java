package jun20;

import java.util.Random;

public class Practice2 {
    public static void main(String[] args) {
        //0<= x <1
        //0<= x < 6
        // 0, 1, 2, 3, 4, 5
        // 1, 2, 3, 4, 5, 6
        int randomNumber1 = 0;
        int randomNumber2 = 0;

        while (randomNumber1 + randomNumber2 != 5) {
            randomNumber1 = (int) (Math.random() * 6) + 1;
            randomNumber2 = (int) (Math.random() * 6) + 1;
            System.out.println("(" + randomNumber1 + "," + randomNumber2 + ")");
        }
    }
}

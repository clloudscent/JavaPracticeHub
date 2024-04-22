package jun06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        String result = score > 90 ? "우수" : "평범";

        if(score>90){
            result = "우수";
        }else{
            result = "평범";
        }

        System.out.println(result);





    }
}

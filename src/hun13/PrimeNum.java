package hun13;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //10 30
        for(int i = a; i<=b; i++){
            boolean isRunnable = true;
            for(int j = 2; j<i; j++){
                if(i%j==0){
                    isRunnable = false;
                    break;
                }
            }
            if(isRunnable){
                System.out.println(i);
            }
        }
    }
}

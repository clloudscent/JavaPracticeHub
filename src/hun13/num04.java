package hun13;

import java.util.Scanner;

public class num04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            boolean isTargetNum = true;
            for(int j=2; j<8;j++){
                if(i%j==0){
                    isTargetNum = false;
                    break;
                }
            }
            if(isTargetNum){
                System.out.println(i);
            }
        }
    }
}

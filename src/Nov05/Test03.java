package Nov05;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(Math.abs(num));
        System.out.println(Math.pow(num,3));
        boolean isRunnable = true;


        Scanner sc = new Scanner(System.in);
        int inputNum = 0;
        int index = 0;
        int output = 0;
        while(isRunnable){
            System.out.print("input: ");
            inputNum = sc.nextInt();
            if(index==0){
                output+= inputNum;
            }else{
                output += inputNum*(int) Math.pow(10,index);
                int x = 1;
                for(int i =1; i<index; i++){
                    x += x*10;
                }
                System.out.println();
                System.out.print("output:");
            }
            System.out.println(output);
            index++;
        }
    }
}

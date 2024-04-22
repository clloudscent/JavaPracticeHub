package march17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();


        //108+2=
        List<Integer> numList = new ArrayList<>();
        List<String> opcodeList = new ArrayList<>();
        int count =0;
        int startNum = 0;
        for(int i =0; i<input.length(); i++){
            System.out.println("i: "+ i);
            System.out.println("count: "+count);
            System.out.println("startNum: "+startNum);
            String currentText = input.substring(i,i+1);
            if(isNumeric(currentText)){
                count++;
            }else{
                opcodeList.add(currentText);
                numList.add(Integer.parseInt(input.substring(startNum,count)));
            }
        }
        System.out.println(numList);
        System.out.println(opcodeList);

        int result = numList.get(0);
        for(int i =0; i<opcodeList.size(); i++){
            if(opcodeList.get(i).equals("+")){
                result = plus(result, numList.get(i+1));
            }else if(opcodeList.get(i).equals("-")){
                result = minus(result, numList.get(i+1));
            }else if(opcodeList.get(i).equals("*")){
                result = multiply(result, numList.get(i+1));
            }else if(opcodeList.get(i).equals("/")){
                result = division(result, numList.get(i+1));
            }
        }
        System.out.println(result);
    }
    public static boolean isNumeric(String a){
        try {
            Integer.parseInt(a);
            return true;
        }catch (Exception e){
            return false;
        }
    }
    public static int plus(int a, int b){
        return a+b;
    }
    public static int minus(int a, int b){
        return a-b;
    }
    public static int multiply(int a, int b){
        return a*b;
    }
    public static int division(int a, int b){
        return a/b;
    }
}

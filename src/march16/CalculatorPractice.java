package march16;

import java.util.Arrays;
import java.util.List;

public class CalculatorPractice {
    public static void main(String[] args) {
        // 5 + 4
        // 32 + 7 - 6 *3
        List<Integer> numList = Arrays.asList(32, 7, 6, 3);
        List<String> opcodeList = Arrays.asList("+", "-", "*");
        int result = numList.get(0);
        for(int i=0; i<opcodeList.size();i++){
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
    public static int plus(int a, int b){
        return a+b;
    }
    public static int minus(int a, int b){
        return a-b;
    }
    public static int multiply(int a, int b){
        return a*b;
    }
    public static int division(int a,int b){
        return a/b;
    }
}

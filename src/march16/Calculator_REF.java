package march16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator_REF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //22+3+7
        String input = sc.nextLine();

        List<Integer> operandList = new ArrayList<>();
        List<String> opcodeList = new ArrayList<>();

        String currentOperand = "";
        for(int i=0;i<input.length();i++){
            String currentChar = input.substring(i, i+1);
            if(isNumeric(currentChar)){
                currentOperand = currentOperand+currentChar;
            }else{
                operandList.add(Integer.parseInt(currentOperand));
                currentOperand = "";
                opcodeList.add(currentChar);
            }
        }

        System.out.println(operandList);
        System.out.println(opcodeList);
        int result = 0;
        for(int i=0; i<operandList.size(); i++){
            if(result==0){
                result = operandList.get(i);
            }
            for(int j=0; j<opcodeList.size(); j++){
                if(opcodeList.get(i).equals("+")){
                    result = plus(result,operandList.get(i+1));
                }
            }
        }
        System.out.println(result);


    }

    public static boolean isNumeric(String str){
        try{
            Integer.parseInt(str);
            return true;
        }catch (NumberFormatException e){
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

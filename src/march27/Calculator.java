package march27;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        List<String> numList = new ArrayList<>();
        List<String> operatorList = new ArrayList<>();

        numberAndOperatorSeparation(formulaInput(), numList, operatorList);
        calculate(numList, operatorList);

        for (int i = 0; i < numList.size(); i++) {
            //
        }
        for (int i = 0; i < operatorList.size(); i++) {
//            System.out.println(operatorList.get(i));
        }


    }
    static String formulaInput(){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return input;
    }

    static void numberAndOperatorSeparation(String input, List<String> numList, List<String> operatorList){
        String operand = "";
        for (int i = 0; i < input.length(); i++) {
            try {
                String currentChar = input.substring(i, i + 1);
                //input.substring(i,i+1) => 0
                Integer.parseInt(currentChar);
                //input.substring(i+1) => +5=
                operand = operand + currentChar;
            } catch (Exception e) {
                numList.add(operand);
                operatorList.add(input.substring(i, i + 1));
                operand = "";
            }
        }
    }

    static void calculate(List<String> numList, List<String> operatorList){
        int result = 0;
        for (int i = 0; i < operatorList.size(); i++){
            if(i==0){
                result = Integer.parseInt(numList.get(0));
            }
            if (operatorList.get(i).equals("=")) {
                System.out.println("result from equals =" + result);
            } else {
                if (operatorList.get(i).equals("+")) {
                    result = plus(result, numList.get(i));
                } else if (operatorList.get(i).equals("-")) {
                    result = minus(result, numList.get(i));
                } else if (operatorList.get(i).equals("*")) {
                    result = multiply(result, numList.get(i));
                } else if (operatorList.get(i).equals("/")) {
                    result = division(result, numList.get(i));
                }
            }
        }
    }

    public static int plus(int result, String b) {
        return result + Integer.parseInt(b);
    }

    public static int minus(int result, String b) {
        return result - Integer.parseInt(b);
    }

    public static int multiply(int result, String b) {
        return result * Integer.parseInt(b);
    }

    public static int division(int result, String b) {
        return result / Integer.parseInt(b);
    }
}

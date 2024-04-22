package march24;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator_Try2 {
    public static void main(String[] args) {
        List<String> numList = new ArrayList<>();
        List<String> operatorList = new ArrayList<>();

        numberAndOperatorSeparation(formulaInput(), numList, operatorList);
        calculate(numList, operatorList);

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
                Integer.parseInt(currentChar);
                operand = operand + currentChar;
            } catch (Exception e) {
                numList.add(operand);
                operatorList.add(input.substring(i, i + 1));
                operand = "";
            }
        }
    }

    static void calculate(List<String> numList, List<String> operatorList){
        int result = Integer.parseInt(numList.get(0));
        for (int i = 0; i < operatorList.size(); i++){
            if (operatorList.get(i).equals("=")) {
                System.out.println("result from equals =" + result);
            } else {
                if (operatorList.get(i).equals("+")) {
                    result = plus(result, Integer.parseInt(numList.get(i+1)));
                } else if (operatorList.get(i).equals("-")) {
                    result = minus(result, Integer.parseInt(numList.get(i + 1)));
                } else if (operatorList.get(i).equals("*")) {
                    result = multiply(result, Integer.parseInt(numList.get(i + 1)));
                } else if (operatorList.get(i).equals("/")) {
                    result = division(result, Integer.parseInt(numList.get(i+1)));
                }
            }
        }
    }

    public static int plus(int result, int b) {
        return result + b;
    }

    public static int minus(int result, int b) {
        return result - b;
    }

    public static int multiply(int result, int b) {
        return result * b;
    }

    public static int division(int result, int b) {
        return result / b;
    }
}

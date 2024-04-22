package march27;

import java.util.ArrayList;
import java.util.List;

public class AdvancedCalculator extends Calculator{
    private double result;
    private String expression = "";

    public void inputButton(String inputKey) {
        expression = expression + inputKey;
        if (inputKey.equals("=")) {
            calculate();
        }
    }

    public void calculate() {
        List<String> numList = new ArrayList<>();
        List<String> operatorList = new ArrayList<>();

        adjustNumListAndOperatorListFromExpression(numList, operatorList, expression);

        this.result = innerProcess(numList, operatorList);
    }

    private int innerProcess(List<String> numList, List<String> operatorList) {
        int result = Integer.parseInt(numList.get(0));
       // something
        //something

        for (int i = 0; i < operatorList.size(); i++) {
            if (operatorList.get(i).equals("+")) {
                result = plus(result, Integer.parseInt(numList.get(i + 1)));
            } else if (operatorList.get(i).equals("-")) {
                result = minus(result, Integer.parseInt(numList.get(i + 1)));
            } else if (operatorList.get(i).equals("*")) {
                result = multiply(result, Integer.parseInt(numList.get(i + 1)));
            } else if (operatorList.get(i).equals("/")) {
                result = division(result, Integer.parseInt(numList.get(i + 1)));
            }
        }
        return result;
    }


    private void adjustNumListAndOperatorListFromExpression(List<String> numList, List<String> operatorList, String expression) {
        String operand = "";
        for (int i = 0; i < expression.length(); i++) {
            String currentChar = expression.substring(i, i + 1);
            try {
                Integer.parseInt(currentChar);
                operand = operand + currentChar;
            } catch (Exception e) {
                numList.add(operand);
                operatorList.add(currentChar);
                operand = "";
            }
        }
    }

    private int plus(int a, int b) {
        return a + b;
    }

    private int minus(int a, int b) {
        return a - b;
    }

    private int multiply(int a, int b) {
        return a * b;
    }

    private int division(int a, int b) {
        return a / b;
    }

    public double getResult() {
        return result;
    }

    public String getExpression() {
        return expression;
    }
}

package march24;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator_Try1 {
    public static void main(String[] args) {
        //1.수식을 input 으로 입력받음
        //2. 입력받은 수식을 분리해서 저장
        // 숫자는 숫자끼리, 연산자는 연산자끼리
        //숫자? subString 으로 연산자 만나면 그 전에 있던 것까지 = 연산자 사용해서 문자열 저장
        //연산자? 연산자 메소드를 if else 문을 활용해서 사용

        //1.수식 input 으로 입력받기
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        //2.숫자 따로 분리해서 '숫자 리스트'에 넣기
        //10+5=
        List<String> numList = new ArrayList<>();
        List<String> operatorList = new ArrayList<>();

        //(3)
        String operand = "";
        for (int i = 0; i < input.length(); i++) {
//            System.out.println("input.length(): "+input.length()+", i: "+i);
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
       int result=Integer.parseInt(numList.get(0));
        for (int i = 0; i < operatorList.size(); i++) {

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
//                System.out.println("result=" + result);
            }
        }


    }

    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {return a - b;}

    public static int multiply(int a, int b) {return a * b;}

    public static int division(int a, int b) {
        return a / b;
    }
}
//1+(2*3
//(
//)

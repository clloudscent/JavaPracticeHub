package march16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator3 {
    public static void main(String[] args) {
        //계산식을 String으로 한번에 받아오기
        //ex)10+5-3=
        //피연산자와 연산자 나눠서 각각의 배열에 넣기
        //  1.String을 한글자씩 접근하면서 숫자인지 아닌지 판별
        //      1-1. 접근된 해당 글자를 Integer.parseInt()를 하여 Exception이 나면 try에서 true를, catch에서 false를 리턴하는 메소드를 만든다.
        //      1-2. 만약 true가 반환되면, 피연산자이므로 + 연산자로 현재문자열에 대입하여 저장, 그렇지 않을 경우, 접근된 글자가 피연산자이므로, 현재문자열을 초기화시키고, 연산자리스트에 접근된 해당 글자를 넣는다.
        //  2.연산자일 경우, 접근한 숫자까지 String으로 묶어서 숫자배열에 넣기
        //  3. for문을 피연산자 크기만큼 돌면서 결과값을 출력하는 for문을 만든다.
        //      3-1. +,-,*,/ 연산자 메소드를 만들고, if else문으로 연산자 메소드와 .equals method를 활용해 알맞은 연산자메소드를 불러와서 피연산자끼리 계산한 결과값을 리턴한다.

        //메소드화
        //1. inputString 받아오는 메소드
        //2. 연산자 피연산자 구별해서 리스트에 넣는 메소드
        //3. 계산하는 메소드
        //4

        int num = 4+7;
        int num2 = plus(4,7);

        //1

       String inputString = makeInputString();



        //2
        List<String> operandList = new ArrayList<>();
        List<String> opcodeList = new ArrayList<>();
        String operand = ""; //10+5-2
        for(int i =0; i<inputString.length(); i++){
            String currentWord = inputString.substring(i,i+1);
            if(isOperand(currentWord)){
                operand = operand+currentWord;
            }else{
                //연산자만나는 곳
                //operand는 언제?
                operandList.add(operand);
                //연산자니까 operand 초기화
                operand = "";
                //연산자니까 연산자리스트에 add
                opcodeList.add(currentWord);
            }
        }

        //3
        int result = Integer.parseInt(operandList.get(0));
        for(int i=0; i<operandList.size(); i++){
            if(opcodeList.get(i).equals("+")){
                result = plus(result, Integer.parseInt(operandList.get(i+1)));
            }else if(opcodeList.get(i).equals("-")){
                result = minus(result, Integer.parseInt(operandList.get(i+1)));
            }else if(opcodeList.get(i).equals("*")){
                result = multiply(result, Integer.parseInt(operandList.get(i+1)));
            }else if(opcodeList.get(i).equals("/")){
                result = division(result, Integer.parseInt(operandList.get(i+1)));
            }

        }

        System.out.println(result);
    }

    public static String makeInputString(){
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        return inputString;
    }


    public static boolean isOperand(String currentWord) {
        try {
            Integer.parseInt(currentWord);
            return true;
        } catch(Exception e) {
            return false;
        }
    }

    public static int plus(int a, int b){return a+b;}
    public static int minus(int a, int b){return a-b;}
    public static int multiply(int a, int b){return a*b;}
    public static int division(int a, int b){return a/b;}
}

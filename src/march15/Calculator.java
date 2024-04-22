package march15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean runnable = true;
        int count =0;
        List<String> inputList = new ArrayList<>();
        runnable = true;

        while(runnable){
            String inputWord = sc.nextLine();
            inputList.add(inputWord);
            if(inputWord.equals("=")){
                runnable = false;
            }
        }

        List<Integer> inputIntegerList = new ArrayList<>();
        List<String> inputOperatorList = new ArrayList<>();

        for(int i =0; i<inputList.size(); i++){
            if(Integer.parseInt(inputList.get(i))*0==0){
                inputIntegerList.add(Integer.parseInt(inputList.get(i)));
            }else{
                inputOperatorList.add(inputList.get(i));
            }
        }

        //4+2*6
        //{4,2,6}
        //{+,*}
        int result = 0;
        for(int i=0; i<inputIntegerList.size(); i++){
            count++;
            if(count==1){
                for(int j=0; j<inputOperatorList.size(); j++){
                    if(inputOperatorList.get(j).equals("+")){
                       result = plus(inputIntegerList.get(i),inputIntegerList.get(i+1));
                    } else if (inputOperatorList.get(j).equals("-")) {
                        result = minus(inputIntegerList.get(i),inputIntegerList.get(i+1));
                    }else if(inputOperatorList.get(j).equals("*")){
                        result = multiply(inputIntegerList.get(i),inputIntegerList.get(i+1));
                    }else if(inputOperatorList.get(j).equals("/")){
                        result = division(inputIntegerList.get(i),inputIntegerList.get(i+1));
                    }
                }
            }else{
                for(int k =0; k<inputOperatorList.size(); k++){
                    if(inputOperatorList.get(k).equals("+")){
                        result = plus(result, inputIntegerList.get(i));
                    }else if(inputOperatorList.get(k).equals("-")){
                        result = minus(result, inputIntegerList.get(i));
                    }else if(inputOperatorList.get(k).equals("*")){
                        result = multiply(result, inputIntegerList.get(i));
                    }else if(inputOperatorList.get(k).equals("/")){
                        result = division(result, inputIntegerList.get(i));
                    }
                }
            }
            System.out.println(result);
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

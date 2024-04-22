package march16;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

/*        int count = 0; //1이 늘어날 때마다 자릿수가 늘어나서 10의 제곱
        int square = 1;
        input = sc.nextLine();

        //"123*2+456"
        int temp = 0;
        for(int i = 0; i<input.length(); i++){
            if(Integer.parseInt(input.substring(i,i+1))*0==0){
                //피연산자
                count++;
                Math.pow(square,count);
                temp  += Integer.parseInt(input.substring(i,i+1))*(count*square);
            }else{
                //연산자
            }
        }*/


        //22+3+7
        //indexCount 3 3
        //indexCount 4 +
        //result 22
        //i=2 +
        //Integer.ParseInt(subString(i-2,i-1)) 22
        //
        int indexCount =0;
        int startIndex = 0;
        int temp1 = 0;
        int temp2 = 0;
        for(int i =0; i<input.length(); i++){
            if(!isNumeric(input.substring(i,i+1))){
                indexCount = i;
                temp1 = Integer.parseInt(input.substring(startIndex, indexCount));
            }
            if(input.substring(i,i+1).equals("+")){
                System.out.println(plus(temp1,temp2));
            }

           /* if(Integer.parseInt(input.substring(i,i+1))*0!=0){
                indexCount = i;
                result = Integer.parseInt(input.substring(startIndex, indexCount-1));
            }*/
        }
    }
    public static int plus(int a, int b){
        return a+b;
    }

    public static boolean isNumeric(String str){
        try{
            Integer.parseInt(str);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}

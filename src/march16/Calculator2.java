package march16;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        System.out.println(isNumeric2("234*23"));

    }

    public static boolean isNumeric(String str){
        try{
            Integer.parseInt(str);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

    public static boolean isNumeric2(String str){
        for(int i=0; i<str.length();i++){
            String currentChar = str.substring(i, i+1);
            if(currentChar.equals("0")){
                continue;
            }
            if(currentChar.equals("1")){
                continue;
            }
            if(currentChar.equals("2")){
                continue;
            }
            if(currentChar.equals("3")){
                continue;
            }
            if(currentChar.equals("4")){
                continue;
            }
            if(currentChar.equals("5")){
                continue;
            }
            if(currentChar.equals("6")){
                continue;
            }
            if(currentChar.equals("7")){
                continue;
            }
            if(currentChar.equals("8")){
                continue;
            }
            if(currentChar.equals("9")){
                continue;
            }
            return false;
        }
        return true;
    }
}

package practice20230115;

import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        System.out.println(list.get(1));



    }

    public static int sum(int num1, int num2){
        int result = num1 + num2;
        return result;
    }

    public static int multiply(int num1, int num2){
        int result = num1*num2;
        return result;
    }
}

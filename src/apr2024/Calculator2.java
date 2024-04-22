package apr2024;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        List<String> inputList = new ArrayList<>();
        List<String> operatorList = new ArrayList<>();
        List<Integer> numList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();




        for(int i =0; i<inputList.size(); i++){
            if(Integer.parseInt(inputList.get(i))*0==0){
                numList.add(Integer.parseInt(inputList.get(i)));
            }else{
                operatorList.add(inputList.get(i));
            }
        }
    }

}

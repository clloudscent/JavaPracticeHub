package march10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MethodPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        List<String> wordList = inputString(a,b);

        reverse(wordList);

    }

    public static List<String> inputString(String a, String b){
        List<String> wordList = new ArrayList<>();
        wordList.add(a);
        wordList.add(b);
        return wordList;
    }

    public static void reverse(List<String> wordList){
        //{blue, sky}
        List<String> reversedList = new ArrayList<>();
        for(int i= wordList.size()-1;i>=0;i--){
            reversedList.add(wordList.get(i));
        }

        wordList.clear();
        wordList.addAll(reversedList);

       for(int i =wordList.size()-1; i>0; i--){
           wordList.set(0,wordList.get(i));
           wordList.set(1, wordList.get(i-1));
        }



        for(int i=0; i<wordList.size(); i++){
            System.out.println(wordList.get(i));
        }
    }
}

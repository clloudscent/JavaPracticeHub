package Jun22;

import java.util.ArrayList;

public class Practice01 {
    public static void main(String[] args) {
        String sentence = "I like to eat apples";
        String[] tokens = sentence.split(" ");
        ArrayList<String> listOfTokens = new ArrayList<>();

        for (int i = 0; i < tokens.length; i++) {
            listOfTokens.add(tokens[i]);
            /*System.out.println(listOfTokens.get(i));*/
        }

        for (int i = tokens.length - 1; i != -1; i--) {
            System.out.print(listOfTokens.get(i));
            System.out.print(" ");
        }
    }
}

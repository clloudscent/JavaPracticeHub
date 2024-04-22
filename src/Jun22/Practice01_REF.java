package Jun22;

import java.util.ArrayList;

public class Practice01_REF {
    public static void main(String[] args) {
        String sentence = "I like to eat apples";
        //["I", "like", "to", "eat", "apples"]
        //["I", "like", "to", "eat", "apples"]

        String[] tokens = sentence.split(" ");

        for(int i=tokens.length-1; i>=0;i--){
            System.out.print(tokens[i]+" ");
        }
    }
}

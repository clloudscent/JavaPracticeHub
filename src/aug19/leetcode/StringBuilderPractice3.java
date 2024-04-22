package aug19.leetcode;

public class StringBuilderPractice3 {
    public static void main(String[] args) {
        String word1 = "a   b   c";
        String word2 = "  p   q   r";

        String merged = mergeStrings(word1, word2);
        System.out.println(merged);
    }

    public static String mergeStrings(String word1, String word2){
        StringBuilder merged = new StringBuilder();
        int i = 0;
        int j = 0;

        while(i<word1.length()||j<word2.length()){
            if(i<word1.length()){
                merged.append(word1.charAt(i));
                i++;
            }

            if(j<word2.length()){
                merged.append(word2.charAt(j));
                j++;
            }
        }
        return merged.toString();
    }
}

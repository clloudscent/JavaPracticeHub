package aug19.leetcode;

public class StringBuilderFinal {
    public static void main(String[] args) {
        String word1 = "  a   b ";
        String word2 = "   p   q   r   s";
        String merged = merge(word1, word2);
        System.out.println(merged);
    }
    public static String merge(String word1, String word2){
        StringBuilder result = new StringBuilder();

        int i =0;

        while(i<word1.length() || i<word2.length()){
            if(i<word1.length()){
                result.append(word1.charAt(i));
            }
            if(i<word2.length()){
                result.append(word2.charAt(i));
            }
            i++;
        }
        return result.toString();
    }
}

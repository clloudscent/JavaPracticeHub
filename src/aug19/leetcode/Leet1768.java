package aug19.leetcode;

public class Leet1768 {
    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pq";

        String merged = merge(word1,word2);
        System.out.println(merged);
    }
    public static String merge(String word1, String word2){
        int i = 0;
        //i = 0;

        StringBuilder sb = new StringBuilder();
        while(i<word1.length() || i<word2.length()){
            if(i<word1.length()){
                sb.append(word1.charAt(i));
            }
            if(i<word2.length()){
                sb.append(word2.charAt(i));
            }
            i++;
        }

        return sb.toString();
    }
}

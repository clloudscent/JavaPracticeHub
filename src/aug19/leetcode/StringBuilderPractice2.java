package aug19.leetcode;

public class StringBuilderPractice2 {
        public static void main(String[] args) {
            String word1 = "a   b";
            String word2 = "  p   q   r   s";

            String merged = merge(word1, word2);
            System.out.println(merged);
            System.out.println(merged.length());
        }
        public static String merge(String word1, String word2){
            StringBuilder sb = new StringBuilder();
            int i = 0;
            int j = 0;

            while(i<word1.length() || j<word2.length()){

                while(i<word1.length() && word1.charAt(i)==' '){
                    i++;
                }
                if(i<word1.length()){
                    sb.append(word1.charAt(i));
                    i++;
                    if(i<word1.length() || j<word2.length()){
                        sb.append(' ');
                    }
                }

                while(j<word2.length() && word2.charAt(j)==' '){
                    j++;
                }
                if(j<word2.length()){
                    sb.append(word2.charAt(j));
                    j++;
                    if(j<word2.length()){
                        sb.append(' ');
                    }
                }
            }
            sb.trimToSize();
            return sb.toString();
        }
    }
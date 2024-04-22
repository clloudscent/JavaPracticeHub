package Jun22;

public class Practice04 {
    public static void main(String[] args) {
        String sentence = "I Have an Orange";
        String[] tokens = sentence.split(" ");

        for(int i =0; i< tokens.length; i++){
            if(tokens[i].equals("Orange")){
                tokens[i]="Apple";
            }
            System.out.print(tokens[i]+" ");
        }
    }
}

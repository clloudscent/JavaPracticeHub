package mar20;

public class Triangle {
    public static void main(String[] args) {
        int lines = 10;
        for(int line =0; line<lines; line++){
            for(int space=0; space<line; space++){
                System.out.print(" ");
            }
            for(int star = lines; star>line; star--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

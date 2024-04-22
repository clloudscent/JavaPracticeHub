package mar20;

public class Triangle2 {
    public static void main(String[] args) {
        String stars = "";
        for(int i=1; i<=10; i++){
            for(int j =0; j<i; j++){
                stars += "*";
            }
            stars+= "\n";
        }
        System.out.println(stars);
    }
}

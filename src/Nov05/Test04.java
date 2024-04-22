package Nov05;

public class Test04 {
    public static void main(String[] args) {
        int num = 4288;
        while (num != 0) {
            int currentIndexNum = num % 10;
            System.out.println(currentIndexNum);


            num = num / 10;
        }
    }
}

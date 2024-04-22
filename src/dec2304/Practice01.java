package dec2304;

public class Practice01 {
    public static void main(String[] args) {
        AnonymousObjectEx ex = new AnonymousObjectEx() {
            @Override
            public void run() {
                System.out.println("실행");
            }
        };

        AnonymousObjectEx ex2 = new AN();


    }
}

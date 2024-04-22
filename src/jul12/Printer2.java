package jul12;

public class Printer2 {
    public static void main(String[] args) {
        println(10);
        println(true);
        println(5.7);
        println("홍길동");
    }
    static void println(int x){
        System.out.println(x);
    }

    static void println(boolean trueOrFalse){
        System.out.println(trueOrFalse);
    }

    static void println(double x){
        System.out.println(x);
    }

    static void println(String name){
        System.out.println(name);
    }
}

package jul12;

public class Printer {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.println(10);
        printer.println(true);
        printer.println(5.7);
        printer.println("홍길동");
    }
    void println(int x){
        System.out.println(x);
    }

    void println(boolean trueOrFalse){
        System.out.println(trueOrFalse);
    }

    void println(double x){
        System.out.println(x);
    }

    void println(String name){
        System.out.println(name);
    }
}

package jul11;

public class Computer {
    private static Computer singleton = new Computer();

    private Computer(){}

    public static Computer getInstance(){
        return singleton;
    }
}

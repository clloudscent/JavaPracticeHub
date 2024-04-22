package jul04;

public class Toy {
    private String id;
    private String modelNo;

    public static String brand = "손오공";

    public void introduce(){
        System.out.println("I am"+modelNo);
    }

    public static void printBrand(){
        System.out.println("이 장난감의 제조사는 "+brand+"입니다.");
    }
}

package apr2627;

public class StringComparator {
    public static void main(String[] args) {
        System.out.println((int)'a');
        System.out.println((int)'A');
        System.out.println((int)'홍');
        System.out.println((int)'김');
        System.out.println((int)'가');
        String name1 = "홍길동";
        String name2= "홍날두";
        if(name1.charAt(0)>name2.charAt(0)){
            System.out.println("a");
            System.out.println(name1.charAt(0));
        }else{
            System.out.println("b");
        }
    }
}

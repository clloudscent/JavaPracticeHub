package oct25;

public class SubstringTest {
    public static void main(String[] args) {
        String a = "홍길동 2023-10-16";
        //홍길동
        //20231016
        System.out.println(a.substring(0,3));

        if(a.length()<4){
            System.out.println("이름");
        }else{
            System.out.println(Integer.parseInt(a.substring(4,8)+a.substring(9,11)+a.substring(12)));
        }
    }
}

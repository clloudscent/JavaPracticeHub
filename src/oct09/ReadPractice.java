package oct09;

public class ReadPractice {
    public static void main(String[] args) throws Exception{
        int keyCode = 0;
        while(true){
            System.out.print("선택: ");
            keyCode = System.in.read();
            System.out.println(keyCode);

        }
    }
}

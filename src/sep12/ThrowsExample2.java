package sep12;

public class ThrowsExample2 {
    public static void main(String[] args) throws Exception{
            findClass();
        System.out.println("test!");
            findClass2();

    }
    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2");
    }

    public static void findClass2(){
        try {
            Class.forName("java.lang.String2");
        }catch (Exception e){
            System.out.println("예외 발생. :"+e.toString());
        }
    }
}

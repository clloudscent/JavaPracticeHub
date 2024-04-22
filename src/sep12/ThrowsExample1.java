package sep12;

public class ThrowsExample1 {
    public static void main(String[] args) {
        try{
            findClass();
//            findMethod();
            findClass2();
            //
            ///
            //
            //

        }catch (ClassNotFoundException e){
            System.out.println("예외 처리: "+e.toString());
        }
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

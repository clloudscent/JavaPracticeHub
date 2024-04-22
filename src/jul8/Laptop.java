package jul8;

public class Laptop {
    static String cpuType = "Intel 계열";
    //멤버 -> 메소드, 필드, 생성자
    String modelNo;

    public void printModelNo(){
        System.out.println("modelNo: "+modelNo);
    }

    public static void printCpuType(){
        System.out.println("cpuType: "+cpuType);
    }

}

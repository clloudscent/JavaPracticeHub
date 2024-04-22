package java200;

public class 중급028 {
    public static final int PHYSICAL = 23;
    public static void main(String[] args) {
        //MathClass 사용해서 신체지수 구하기
        int index = PHYSICAL;
        int days = 1200;
        double phyval = 100-Math.sin((days%index)*2*Math.PI/index);
        System.out.println(phyval);

    }
}

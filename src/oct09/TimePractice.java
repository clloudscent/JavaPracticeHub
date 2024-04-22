package oct09;

public class TimePractice {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        long result = 0;
        for(int i=0; i<10000000;i++){
            result +=i;
        }
        long endTime = System.currentTimeMillis();
        long spendTime = endTime-startTime;
        System.out.println(spendTime);

    }
}

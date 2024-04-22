package nov03;

public class No9_SumArray {
    public static int sumArray(int[] A){
        int sum = 0 ;
        for(int currentInt : A){
            sum += currentInt;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] A = {25,35,501,256};
        System.out.println(sumArray(A));
    }
}

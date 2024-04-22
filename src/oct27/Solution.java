package oct27;

public class Solution {
    public static int solution(int[] A){
        int currentValue = 0;
        int answer = 0;
        for(int i =0; i<A.length+1; i++){
            currentValue = A[i];
            if(currentValue<A[i+1]){
                answer = currentValue+1;
            }
        }
        return 0;

    }

    public static void main(String[] args) {
        int[] input = new int[]{3,6,7,4,2,1,1};
        /*input = new int[]{1,1,2,3,4,6,7};*/
        int result = solution(input);
        System.out.println(result);

    }
}

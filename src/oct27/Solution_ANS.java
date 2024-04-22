package oct27;

public class Solution_ANS {
    public static int solution(int[] A){
        boolean[] existNumArray = new boolean[A.length];

        for(int i=0; i<A.length;i++){
            int currentNum = A[i];
            if(currentNum > 0 && currentNum <= A.length){
                existNumArray[currentNum-1] = true;
            }

            //
            //
        }
        for(int i=0; i<existNumArray.length;i++){
            if(!existNumArray[i]){
                return i+1;
            }
        }
        return A.length+1;
    }

    public static void main(String[] args) {
        int[] input = new int[]{3,6,7,4,2,1,1};
        /*input = new int[]{1,1,2,3,4,6,7};*/
        int result = solution(input);
        System.out.println(result);

    }
}

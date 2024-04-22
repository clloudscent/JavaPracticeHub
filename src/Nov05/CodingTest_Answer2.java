package Nov05;

public class CodingTest_Answer2 {

    public static void main(String[] args) {
        CodingTest_Answer2 sol = new CodingTest_Answer2();

        System.out.println(sol.solution(new int[]{25, 35, 501, 256}));
        System.out.println(sol.solution(new int[]{77, 23, 37, 107}));
    }

    public int solution(int[] A){
        int result = -1;
        boolean[][] totalDigitsExistArray = new boolean[A.length][10];
        for(int i=0; i<A.length;i++){
            totalDigitsExistArray[i] = getDigitExistArray(A[i]);
        }

        for(int i=0; i<A.length; i++){
            for(int j=i+1;j<A.length;j++){
                if(!checkCommonDigits(totalDigitsExistArray[i], totalDigitsExistArray[j])){
                    int sum = A[i]+A[j];
                    if(result<sum){
                        result = sum;
                    }
                }
            }
        }

        return result;
    }

    private boolean[] getDigitExistArray(int num){
        boolean[] digits = new boolean[10];
        if(num==0){
            digits[0] = true;
        }
        while(num>0){
            //501
            //50
            int currentNum = num%10;
            digits[currentNum] = true;
            num = num/10;
        }
        return digits;
    }

    private boolean checkCommonDigits(boolean[] digits1, boolean[] digits2){
        for(int i=0; i<10;i++){
            if(digits1[i]&&digits2[i]){
                return true;
            }
        }
        return false;
    }
}

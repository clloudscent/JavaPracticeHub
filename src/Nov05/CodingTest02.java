package Nov05;

public class CodingTest02 {
    public int solution(int[] A) {
        int maxNum = -1;
        for (int i = 0; i < A.length; i++) {
            int currentNum = A[i];
            boolean[] booleans1 = convertIfNumExist(currentNum);
            for (int j = i; j < A.length; j++) {
                int compareNum = A[j];
                boolean[] booleans2 = convertIfNumExist(compareNum);
                if (!compareTwoBooleans(booleans1, booleans2)) {
                    if ((currentNum + compareNum) > maxNum) {
                        maxNum = currentNum + compareNum;
                    }
                }
            }
        }
        return maxNum;
    }


    public boolean compareTwoBooleans(boolean[] booleans1, boolean[] booleans2) {
        boolean isSameDigitExist = false;
        //75 35
        //[0,0,0,0,0,1,0,1,0,0]
        //[0,0,0,1,0,1,0,0,0,0]
        for (int i = 0; i < 10; i++) {
            if (booleans1[i] && booleans2[i]) {
                isSameDigitExist = true;
            }
        }
        return isSameDigitExist;
    }

    public boolean[] convertIfNumExist(int numToConvert) {
        //75

        boolean[] booleans = new boolean[10];
        for (int i = 0; i < 10; i++) {
            int currentDigit = numToConvert % 10;
            booleans[currentDigit] = true;
            numToConvert /= 10;
        }
        return booleans;
    }

    public static void main(String[] args) {
        CodingTest02 sol = new CodingTest02();
        //-1
        System.out.println(sol.solution(new int[]{25, 35, 501, 256}));
        //130
        System.out.println(sol.solution(new int[]{77, 23, 37, 107}));
        //15
        System.out.println(sol.solution(new int[]{15, 0, 105}));

//        int num = 75;
//        sol.convertIfNumExist(75)
    }
}

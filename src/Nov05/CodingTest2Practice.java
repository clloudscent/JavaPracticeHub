package Nov05;

public class CodingTest2Practice {
    public static boolean compareTwoBooleans(boolean[] booleans1, boolean[] booleans2) {
        boolean isSameDigitExist = false;
        //75 35
        //[0,0,0,0,0,1,0,1,0,0]
        //[0,0,0,1,0,1,0,0,0,0]
        for (int i = 0; i < 10; i++) {
            if ((booleans1[i] == true) && (booleans2[i] == true)) {
                isSameDigitExist = true;
            }
        }
        return isSameDigitExist;
    }

    public static boolean[] convertIfNumExist(int A) {
        boolean[] booleans = new boolean[10];

        for (int i = 0; i < 10; i++) {
            int currentDigit = A % 10;
            booleans[currentDigit] = true;
            A /= 10;
        }
        return booleans;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(convertIfNumExist(105)[i]);

        }
        /*boolean[] A = {false, false, false, false, false, false, false, true, false, false};
        boolean[] B = {false, false, false, true, false, true, false, false, false, false};
        System.out.println(compareTwoBooleans(A, B));*/


    }
}

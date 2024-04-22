package Nov05;

public class CodingTest03_3 {
    public static int solution(int[] A) {
        int maxNum = -1;
        for (int i = 0; i < A.length; i++) {
            //A[i]의 숫자를 boolean 배열로 변환시키고, 해당 배열을 기준으로 for 문을 한번 더 돌면서 해당 배열과 같은 수가 있는지 체크
            boolean[] booleanA = booleanArrayForExistDigit(A[i]);

            for (int j = i; j < A.length; j++) {
                boolean[] booleanB = booleanArrayForExistDigit(A[j]);

                if (!hasSameDigits(booleanA, booleanB)) {
                    if ((A[i] + A[j]) > maxNum) {
                        maxNum = A[i] + A[j];
                    }
                }
            }
        }

        return maxNum;
    }

    //두 boolean 배열을 비교해서 같은 index 값이 true 인지 아닌지 판별하여 true, false 반환하기
    private static boolean hasSameDigits(boolean[] booleansA, boolean[] booleansB) {
        boolean haveSameDigit = false;
        for (int i = 0; i < 10; i++) {
            if (booleansA[i] && booleansB[i]) {
                //같은 자릿수에 true 값이 담겨있음
                haveSameDigit = true;
            }
        }
        return haveSameDigit;
    }


    //매개변수안에 담긴 정수의 자릿수를 각각 boolean 배열에 true 로 변환시켜 대입하기
    private static boolean[] booleanArrayForExistDigit(int num) {
        //25
        boolean[] existDigit = new boolean[10];
        int currentNum = num;

        if(num==0){
            existDigit[0] = true;
        }

        while (num > 0) {

            currentNum = num % 10;
            existDigit[currentNum] = true;
            //currentNum = 5, num = 25


            num /= 10;
        }

        return existDigit;
    }


    public static void main(String[] args) {
        //?
        int[] array1 = {25, 35, 501, 256};
        //130
        int[] array2 = {77, 23, 37, 107};
        System.out.println(solution(array1));

        System.out.println(solution(array2));
    }
}

package nov03;

public class Solution {
    public int solution(int[] A) {
//가장 큰 조합을 저장할 변수, 초기값은 -1
        int result = -1;

//각 숫자별로 숫자포함 여부를 저장하는 2차원 배열 선언
        boolean[][] totalDigitsExistArray = new boolean[A.length][10];

//배열의 각 요소에 대해 숫자 포함 여부를 분석하고 2차원 배열에 저장
        for (int i = 0; i < A.length; i++) {
            totalDigitsExistArray[i] = getDigitExistArray(A[i]);
        }


//배열의 모든 요소들 사이의 조합을 확인하고 가장 큰 합을 구하기
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (checkNoCommonDigits(totalDigitsExistArray[i], totalDigitsExistArray[j])) {

                    int currentSum = A[i] + A[j];
                    if (currentSum > result) {
                        result = currentSum;
                    }

                }
            }
        }


        return result;
    }

    //입력받은 숫자의 10진수의 숫자 포함 여부를 계산하는 메소드
    private boolean[] getDigitExistArray(int num) {
        boolean[] digits = new boolean[10];
        if (num == 0) {
            digits[0] = true;
        }
        while (num > 0) {
//1의 자리수에 존재하는 숫자를 배열에 포함처리
            digits[num % 10] = true;
//자리수 하나 삭제
            num = num / 10;
        }
        return digits;
    }

    //2개의 숫자포함여부 배열을 입력받아서 공통된 수가 없는지를 반환하는 메소드 (없으면 true, 있으면 false)
    private boolean checkNoCommonDigits(boolean[] digitArray1, boolean[] digitArray2) {
        for (int i = 0; i < 10; i++) {
            if (digitArray1[i] && digitArray2[i]) {
                return false;
            }
        }
        return true;
    }
}


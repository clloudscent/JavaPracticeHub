package Nov05;

import jul31.num07.Parent;

public class CodingTest01 {
    public int solution(int[] A){
        int maxNum = -1;
        for(int i =0; i<A.length; i++){
            boolean[] booleansA = convertToBoolean(A[i]);
            for(int j =i; j<A.length; j++){
                boolean[] booleansB = convertToBoolean(A[j]);
                if(compareTwoArray(booleansA,booleansB)&&((A[i]+A[j])>maxNum)){
                    maxNum = A[i]+A[j];
                }
            }
        }
        return maxNum;
    }
    //해당 정수의 자릿수를 0~9까지의 boolean 배열 안에 true 로 바꿔주는 메소드
    private boolean[] convertToBoolean(int a){
        int num = a;
        boolean[] booleans = new boolean[10];
        //195
        if(num==0){
            booleans[0] = true;
        }
        while(num>0){
            int index = num % 10;
            booleans[index] = true;
            num = num/10;
        }
        return booleans;
    }

    private boolean compareTwoArray(boolean[] A, boolean[] B){
        boolean isNotDuplicated = true;
        for(int i =0; i<10; i++){
            if(A[i]&&B[i]){
                isNotDuplicated =  false;
            }
        }
        return isNotDuplicated;
    }

    public static void main(String[] args) {
        CodingTest01 sol = new CodingTest01();
        //-1
        System.out.println(sol.solution(new int[]{25, 35, 501, 256}));
        //130
        System.out.println(sol.solution(new int[]{77, 23, 37, 107}));
        //15
        System.out.println(sol.solution(new int[]{15, 0, 105}));
    }
}

package nov16;

public class Practice01 {
    public static int solution(int[] A){
        int maxNum = -1;
        for(int i =0; i<A.length; i++){
            boolean[] booleansA = diverNumToBooleans(A[i]);
            for(int j=1; j<A.length; j++){
                boolean[] booleansB = diverNumToBooleans(A[j]);
                if(!isDuplicateNumExist(booleansA, booleansB)){
                    if((A[i]+A[j])>maxNum){
                        maxNum = A[i]+A[j];
                    }
                }
            }
        }
        return maxNum;
    }

    public static boolean[] diverNumToBooleans(int num){
        //7321
        boolean[] booleans = new boolean[10];

        //105
        if(num==0){
            booleans[0] = true;
        }
        while(num>0){
            int currentNum = num%10;
            booleans[currentNum] = true;
            num /= 10;
        }

        return booleans;
    }

    public static boolean isDuplicateNumExist(boolean booleansA[], boolean booleansB[]){
        boolean isDuplicateNumExist = false;
        for(int i =0; i<10; i++){
            if(booleansA[i]&&booleansB[i]){
                isDuplicateNumExist = true;
            }
        }
        return isDuplicateNumExist;
    }


    //[105,21,35,67]; 172
    //[7,17,67,84]; 151
    public static void main(String[] args) {
        int[] A = {105,21,35,67, 7321};
        int[] B = {7,17,84,67};
        System.out.println(solution(A));
        System.out.println(solution(B));
    }
}

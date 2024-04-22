package nov16;

public class IsDuplicateNumExist {
    public static boolean isDuplicateNumExist(boolean booleansA[], boolean booleansB[]) {
        boolean isDuplicateNumExist = false;
        for (int i = 0; i < 10; i++) {
            if (booleansA[i] && booleansB[i]) {
                isDuplicateNumExist = true;
            }
        }
        return isDuplicateNumExist;
    }


    //[105,21,35,67]; 172
    //[7,17,67,84]; 151
    public static void main(String[] args) {
        //int[] A = {105,21,35,67, 7321};
        boolean[] A = {true, true, false, false, false, true, false, false, false, false};
        boolean[] B = {false, true, true, true, false, false, false, true, false, false};
        System.out.println(isDuplicateNumExist(A, B));
    }
}

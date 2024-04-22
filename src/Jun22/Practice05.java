package Jun22;

public class Practice05 {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int intArray2[] = null;
        intArray2 = new int[]{1,2,3,4};

//        intArray2[1] = 4;

//        System.out.println(intArray2[0]);

        intArray[7] = 6;
        int num = intArray[7];

        intArray[num] = 560;
        for(int i=0; i<intArray.length;i++){
            System.out.println(intArray[i]);
        }

    }
}

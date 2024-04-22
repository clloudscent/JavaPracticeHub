package jul04;

public class Practice {
    public static void main(String[] args) {
        int[][] arrayOfIntArray = new int[5][];
        //[1,2,3,4,5]
        //[1,2,3,4,5]
        int[] intArray = {1,2,3,4,5};
        int[] copiedArray = new int[10];

        System.arraycopy(intArray, 0, copiedArray, 0, intArray.length);
        for(int i=0; i<copiedArray.length;i++){
            System.out.println(copiedArray[i]);
        }
    }
}

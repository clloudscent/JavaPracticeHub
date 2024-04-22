package Jun22;

public class Practice06 {

    public static void main(String[] args) {
        int[] array = {6,7,3,1,24,33,66,11,0,99};

//        printIntArrayItem(array);

//        printIntArrayItem(new int[]{6,7,3,1,24,33,66,11,0,99});

        int num;
        int[] intArray = new int[10];
        System.out.println(intArray[5]);
        System.out.println(intArray.length);

    }

    public static void printIntArrayItem(int[] intArray){
        for(int i=0; i<intArray.length;i++){
            System.out.println(intArray[i]);
        }
    }
}

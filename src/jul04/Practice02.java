package jul04;

public class Practice02 {
    public static void main(String[] args) {
        //original for loop
        int[] intArray = {1,2,3,4,5,6,7};
        for(int i=0; i<intArray.length;i++){
            System.out.println(intArray[i]);
        }

        for(int currentInt : intArray){
            System.out.println(currentInt);
        }
    }
}

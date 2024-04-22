package methodAssginment;

public class Num02 {
    public int findMax(int[] arr){
        int a = arr[0];
        for(int i =0; i<arr.length; i++){
            if(arr[i]>a){
                a = arr[i];
            }
        }
        return a;
    }
}

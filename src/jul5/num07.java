package jul5;

public class num07 {
    public static void main(String[] args) {
        int[] array = {1,5,3,8,2};
        int maxValue = 0;
        for(int i: array){
            if(maxValue<i){
                maxValue = i;
            }
        }
        System.out.println(maxValue);
    }
}

package oct27;

public class Solution2 {
    public static int solution(int[] A){
       int[] intArray = new int[100000];
       for(int i = 0; i<intArray.length; i++){
           intArray[i]=i+1;
       }
       //int[] input = new int[]{3,6,7,4,2,1,1};
       //{1,2,3,4,5,6,7,8,9......}

       int answer = 0;

       for(int currentInt : A){
           intArray[currentInt-1]=0;
       }
       //{1,2,3,4,5,6,7,8,9......}

       for(int i =0; i<intArray.length; i++){
           if(intArray[i]!=0){
               answer = intArray[i];
               break;
           }

       }
       return answer;
    }

    public static void main(String[] args) {
        int[] input = new int[]{3,6,7,4,2,1,1};
        /*input = new int[]{1,1,2,3,4,6,7};*/
        int result = solution(input);
        System.out.println(result);

    }
}

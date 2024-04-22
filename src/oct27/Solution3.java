package oct27;

public class Solution3 {
    public static int solution(int[] A){
       boolean[] booleans = new boolean[100000];
       int answer = 0;
       booleans[0] =true;
       for(int currentInt : A){
           if(currentInt>0){
               booleans[currentInt]=true;
           }
       }
       //{false,true,true,false,true,true, true,true, false....}
        //true = [4]

       for(int i =1; i<booleans.length; i++){
           if(booleans[i]!=true){//4
               answer = i; //4
               break;
           }
       }
       return answer;
    }

    public static void main(String[] args) {
        int[] input = new int[]{-1,5,3,6,7,4,2,1,1};
        /*input = new int[]{1,1,2,3,4,6,7};*/
        int result = solution(input);
        System.out.println(result);

    }
}

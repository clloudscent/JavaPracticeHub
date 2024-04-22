package Nov05;

public class Test05 {
    public static void main(String[] args) {
        int num = 4288;


        while(num!=0){

            int currentIndexNum = num % 10;
            System.out.println(currentIndexNum);

            int checkForDuplicateNum = num/10;
            while(checkForDuplicateNum!=0){
                int nextNum = checkForDuplicateNum%10;
                if(nextNum==currentIndexNum){
                    break;
                }else{
                    num = num/10;
                }
            }
        }
    }
}

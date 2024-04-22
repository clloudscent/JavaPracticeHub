package Nov05;

public class PracticeNumGenerating {
    public static void main(String[] args) {
        int inputNum = 7;
        int index = 2;
        System.out.println(makeNum(inputNum, index));
    }

    public static int makeNum(int num, int positionNum){
        int result = num;
        for(int i=0; i<positionNum;i++){
            result = result*10;
        }
        return result;
    }
}

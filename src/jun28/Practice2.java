package jun28;

public class Practice2 {
    public static void main(String[] args) {
        int num = 7;
//        int[] numArray = new int[10];
        int[] numArray = new int[]{3, 5, 2, 1};
        int[] numArray2 = null;

        numArray2 = new int[]{2, 4, 6, 7};

        printNum(num);
        int[] numArray3 = new int[5];

        printItem(new int[]{3, 5, 2, 1});
    }

    public static void printNum(int numToPrint){
        System.out.println(numToPrint);
    }

    public static void printItem(int[] scores){
        for(int i=0; i<scores.length;i++){
            System.out.println(scores[i]);
        }
    }
}

package jun28;

import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        int num = 7;
        String text = "test";

        int[] intArray = new int[10];
        for(int i=0; i<intArray.length;i++){
            intArray[i] = (int)(Math.random()*10)+1;
            System.out.println(intArray[i]);
        }

        String[] strArray = new String[5];

        strArray[0] = "apple";
        strArray[1] = "banana";
        strArray[2] = "orange";

        String[] classStudentArray = new String[3];
        classStudentArray[0] = "홍길동";
        classStudentArray[1] = "임꺽정";
        classStudentArray[2] = "호날두";

        List<List<String>> studentList = new ArrayList<>();

        String[][] studentArray = new String[5][];

        studentArray[0] = classStudentArray;










    }
}

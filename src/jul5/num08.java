package jul5;

public class num08 {
    public static void main(String[] args) {
        int[][] array = {
                {95,86},
                {83,92,96},
                {78,83,93,87,88}
        };
        int sum = 0;
        int avg = 0;
        int totalNum = 0;

        System.out.println(95+86+83+92+96+78+83+93+87+88);
        System.out.println((95+86+83+92+96+78+83+93+87+88)/10);

        for(int i =0; i< array.length; i++){
            totalNum += array[i].length;
            for(int j =0; j<array[i].length; j++){
                sum += array[i][j];
            }
        }
        avg = sum/totalNum;
        System.out.println(sum);
        System.out.println(avg);
    }
}

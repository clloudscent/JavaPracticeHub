package jul10;

public class Practice2 {
    int sum(int ... values){
        int result = 0;
        for(int i=0; i<values.length;i++){
            result += values[i];
        }

        return result;
    }
}

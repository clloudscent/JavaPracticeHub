package Nov05;

import java.util.ArrayList;
import java.util.List;

public class Test02_Answer {
    public static int solution(int A){
        int result =0;

        //해당 정수를 구성하는 숫자를 분리해서 추출
        List<Integer> digitExistList = getDigitExistList(A);

        //분리된 리스트를 오름차순으로 정렬
        bubbleSort(digitExistList);
//        System.out.println(digitExistList);

        //정렬된 리스트를 하나의 숫자로 병합
        result = mergeDigitAsInteger(digitExistList);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution(592211442));
    }

    private static List<Integer> getDigitExistList(int num){
        List<Integer> result = new ArrayList<>();
        if(num ==0){
            result.add(0);
        }
        //77
        while(num>0){
            int currentDigit = num%10;
            if(!isDuplicatedNum(result, currentDigit)){
                result.add(currentDigit);
            }
            num/=10;
        }
        return result;
    }

    private static boolean isDuplicatedNum(List<Integer> targetList, int targetNum){
        boolean result = false;
        for(int i=0; i<targetList.size();i++){
            if(targetList.get(i).equals(targetNum)){
                result = true;
                break;
            }
        }
        return result;
    }

    private static void bubbleSort(List<Integer> list){
        for(int i=0; i<list.size();i++){
            for(int j=0;j<list.size()-i-1;j++){
                if(list.get(j)>list.get(j+1)){
                    int temp = list.get(j+1);
                    list.set(j+1, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

    private static int mergeDigitAsInteger(List<Integer> digitList){
        int num = 0;
        int index =0;
        for(int i=digitList.size()-1;i>=0;i--){
            int currentDigit = digitList.get(i);

            //
            for(int j=0; j<index;j++){
                currentDigit = currentDigit*10;
            }
            index++;
            //
            num+=currentDigit;
        }
        return num;
    }

}

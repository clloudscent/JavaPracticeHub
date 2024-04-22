package methodAssginment;

public class Num05 {
    //정수 배열과 목표 값을 전달받아서 목표값과 같은 값을 갖는 요소가 몇 개인지를 반환하는 메소드 작성
    //정수배열, 목표값 전달 = 매개변수
    //같은 값을 갖는 요소가 몇개? for문을 돌면서 value값과 같으면 count 증가

    public int count(int[] arr, int value){
        int count = 0;
        for(int i= 0; i<arr.length; i++){
            if(arr[i] == value){
                count += 1; //count++
            }
        }
        return count;
    }
}

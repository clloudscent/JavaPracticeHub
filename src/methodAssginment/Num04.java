package methodAssginment;

public class Num04 {
    public static void main(String[] args) {
        System.out.println(isTrue("racecar"));
        System.out.println(isTrue("super"));


    }
    //전달받은 문자열이 회문인지 확인하는 메소드 작성
    //거꾸로 읽어도 제대로 읽는 것과 같은 문장이나 낱말, 숫자, 문자열
    //다시합창합시다
    //racecar
     static boolean isTrue(String a){
        //racecar
        //[r,a,c,e,c,a,r]
        boolean isSame = true;
        char[] arr = new char[a.length()];
        char[] reverseArr = new char[a.length()];
        for(int i = 0; i<a.length(); i++){
            arr[i] = a.charAt(i);
//            System.out.print(arr[i]);
        }
//         System.out.println();


        for(int i =a.length()-1, index=0; i>=0; i--){
            reverseArr[index] = a.charAt(i);
            //reverseArr[0] [1] [2]
//            System.out.print(reverseArr[index]);
            index++;
        }

//         System.out.println();
        for(int i =0; i<a.length(); i++){
//            System.out.println(arr[i]);
//            System.out.println(reverseArr[i]);
            if(arr[i]!=reverseArr[i]){
                isSame = false;
                return isSame;
            }
        }
        return isSame;
    }
}

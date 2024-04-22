package mar20;
public class Multiplication {
    public static void main(String[] args) {
        String temp = ""; //모든 출력내용 저장

        for(int i =2; i<=9; i++){
            System.out.print(i+"단"+"__________");
        }
        System.out.println();

        for(int i = 1; i<=9; i++){
            for(int j = 2; j<=9; j++){
                temp += j+"x"+i+"="+(j*i)+"_______"; //temp에 곱셈 결과를 추가
            }
            //다음 줄로 넘어감
            temp += "\n";
        }
        System.out.println(temp);
    }
}

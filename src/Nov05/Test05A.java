package Nov05;

public class Test05A {
    public static void main(String[] args) {
        int a = 472711;
        int answer = 0;

        while(a!=0) {
            //a의 나머지연산을 통해 해당 자릿수에 접근해서 currentIndexNum 에 저장한다.
            int currentIndexNum = a%10; //1

            //해당 자릿수가 이미 들어있는 숫자인지 비교한다
            //비교할 자릿수(다음자릿수) = a / 10 을 한값의 나머지연산 %10
            int nextIndexNum =0; //

            boolean isNotDuplicated = true;

            //while문을 한번더 돌린다
            /*while(비교할 다음자릿수 = 해당자릿수){
                같다면 break;
                다르다면 출력;
            }*/

            while(nextIndexNum != 0){
                nextIndexNum = a/10%10; //1
                if(nextIndexNum == currentIndexNum){
                    isNotDuplicated = false;
                    break;
                }else{
                    nextIndexNum = nextIndexNum/10;
                }
            }

            if(isNotDuplicated){
                answer = answer * 10 + currentIndexNum;
            }
            a = a/10;//다음자릿수로 이동하기
        }
        System.out.println("answer: "+answer);
    }
}

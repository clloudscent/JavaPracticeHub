package Nov05;

public class Test05B {
    public static void main(String[] args) {
        int number = 47271;
        int currentIndexNum = 1;
        int answer = number%10;
        int answersCurrentIndexNum = 1;
        boolean isDuplicated = false;

        while(currentIndexNum>0){
            currentIndexNum = number % 10;
            number = number/10;

            System.out.println("현재 자릿수:  "+currentIndexNum);
            System.out.println("answerCurrentIndexNum: "+ answersCurrentIndexNum);
            while(answersCurrentIndexNum>0){
                answersCurrentIndexNum = answer%10;
                System.out.println("현재 answer의 자릿수: "+answersCurrentIndexNum);
                if(currentIndexNum==answersCurrentIndexNum){
                    System.out.println("현재 answer에 담긴 자릿수의 값과 number를 돌면서 현재 접근된 자릿수의 값이 중복되어있습니다.");
                    isDuplicated = true;
                    break;
                }else{
                    System.out.println("answer의 해당 자릿수값과 현재자릿수의 값은 중복되지않았으므로 다음 자릿수로 넘어가서 비교");
                    System.out.println("answer 에 담기는 수: "+answer);
                    answer = answer/10;

                }
            }
            if(isDuplicated==false){
                System.out.println("중복되지않으므로 answer에 현재 자릿수의 값이 대입되었습니다. ");
                answer = answer * 10 + currentIndexNum;
            }
        }

        System.out.println("finalAnswer: "+answer);
    }
}

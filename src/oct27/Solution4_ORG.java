package oct27;

public class Solution4_ORG {
    public int solution(int[] A){
        boolean[] booleans = new boolean[100001];
        //10만개의 boolean타입의 배열을 선언해서 A 배열에 있는 값을 boolean의 인덱스 값에 true로 선언해주기
        //그렇게되면 최초로 나온 false 값이 답이 된다고 생각해서
        int answer = 0;
        //for문안에서 리턴을 못해주기때문에 리턴할 정답 값을 미리 밖에서 선언
        for(int currentInt : A){
            if(currentInt>0 && currentInt<=100000){
                booleans[currentInt] = true;
            }

            //매개변수로 받아온 A배열을 enhanced for 문으로 돌면서 value 하나하나에 접근

                //현재 접근한 A배열의 value값은 무조건 0보다 커야되니까 0보다 큰지 비교하기

                //0보다 큰 A에서 currentInt로 접근한 양수값들을 booleans 배열의 인덱스값에 접근해 true 대입해주면
                //booleans의 인덱스값이 true인 값은 A에 선언되어있는 양수값과 같다

        }
        for(int i =1; i<booleans.length; i++){
            //1부터 booleans의 길이만큼 하나씩 순서대로 접근. 0은 false인 상태이므로 0은 건너뛰어야함
            if(booleans[i]==false){
                // 만약 booleans 배열의 i번째 값이 false이면 A라는 배열에 없는 숫자가 나온것이므로,
                //조건에 만족하는 수라서 answer에 booleans 인덱스에 해당하는 i를 담고 break로 종료
                answer = i;
                break;
            }else{
                answer = i+1;
            }
        }
        return answer;
        //answer 리턴
    }
    public static void main(String[] args) {
        int[] A = {2,1,-1,6,4,3,4,5,5000};
        A = new int[100000];
        for(int i=0; i<A.length;i++){
            A[i] = i+1;
        }
        A = new int[]{-1,-2, 1,2,3,4,5,150000,7, 20, 55,200000};
        Solution4_ORG solution4 = new Solution4_ORG();
        System.out.println(solution4.solution(A));
    }
}

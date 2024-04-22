package marathon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("참가자 수:");
        int totalRunner = sc.nextInt();
        sc.nextLine();
        Map<String, String> runnerMap = new HashMap<>();

        while(runnerMap.size()<totalRunner){
        //for(int i =0; i<totalRunner; i++){ //i가 0부터 시작하는데, totalRunner이 i보다 작거나 '같을때'까지 조건을 거는게 맞는지 모르겠습니다.
            String name = sc.nextLine();
            runnerMap.put(name, name); //key, value로 name을 두번 넣는게 맞는지 잘 모르겠습니다.
        }

        boolean runnable = true;
        while(runnable){
            System.out.println("완주자: ");
            String inputName = sc.nextLine();

            if(runnerMap.containsKey(inputName)){
                runnerMap.remove(inputName);
                totalRunner -= 1;
                System.out.println("남아있는 주자: "+totalRunner);
            }else{
                System.out.println("해당 주자는 이미 완주를 했습니다.");
            }
            runnerMap.get(inputName);
            if(totalRunner==0){
                runnable = false;
            }
        }
    }
}

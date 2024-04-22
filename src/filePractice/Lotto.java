package filePractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        //1부터 45까지 숫자 중에서 6개를 선택해서 번호 구성

        Random random = new Random();
        List<Integer> lottoNumbersList = new ArrayList<>();

        while (lottoNumbersList.size()<6){
            int randomNum = random.nextInt(45)+1;
            //0부터 44개까지의 난수가 생성되므로 1을 더해줘서 1부터 45까지로 조정

            if(!lottoNumbersList.contains(randomNum)){
                lottoNumbersList.add(randomNum);
            }
        }

        for(int i =0; i<lottoNumbersList.size()-1; i++){
            for(int j=0; j<lottoNumbersList.size()-1-i; j++){
                if(lottoNumbersList.get(j)>lottoNumbersList.get(j+1)){
                    int temp = lottoNumbersList.get(j);
                    lottoNumbersList.set(j, lottoNumbersList.get(j+1));
                    lottoNumbersList.set(j+1, temp);
                }
            }
        }

        System.out.println("로또번호:");
        for(int i =0; i<lottoNumbersList.size(); i++){
            System.out.println(lottoNumbersList.get(i));
        }
    }
}

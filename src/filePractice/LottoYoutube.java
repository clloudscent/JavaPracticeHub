package filePractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoYoutube {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        // 1부터 45까지의 숫자를 리스트에 추가
        for (int i = 1; i <= 45; i++) {
            numbers.add(i);
        }

        // 리스트의 숫자를 섞음
        Collections.shuffle(numbers);

        // 섞인 리스트에서 앞에서부터 6개의 숫자를 선택
        List<Integer> selectedNumbers = numbers.subList(0, 6);

        // 선택한 숫자를 정렬
        Collections.sort(selectedNumbers);

        // 선택한 숫자를 출력
        System.out.println("로또 번호:");
        for (int number : selectedNumbers) {
            System.out.print(number + " ");
        }
    }
}


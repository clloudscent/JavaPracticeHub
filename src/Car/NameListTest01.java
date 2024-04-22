package Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NameListTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> nameList = new ArrayList<>();
        CountList3 countList3 = new CountList3();

        System.out.println("넣을 이름의 수");
        int total = sc.nextInt();
        sc.nextLine();


        for(int i = 0; i<total; i++) {
            System.out.println("이름: ");
            String name = sc.nextLine();
            nameList.add(name);
        }

        CountListTest countList = new CountListTest();
        //System.out.println("가장많이입력된이름: "+countList.nameCounter(nameList));
        System.out.println(countList3.countList(nameList));
    }
}

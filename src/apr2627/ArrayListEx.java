package apr2627;

import java.util.ArrayList;

public class ArrayListEx {
    //https://www.youtube.com/watch?v=viTHc_4XfCA
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<>();

        people.add("Dave");
        people.add("John");
        people.add("Jane");
        people.add("Alex");

        people.remove("Dave");
        people.remove(1);

        if(people.contains("John")){
            System.out.println("존재합니다.");

        }
        if (people.isEmpty()){
            System.out.println("빈 리스트 입니다.");
        }

        people.clear();
    }
}

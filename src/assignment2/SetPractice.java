package assignment2;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        Set<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(4);
        intSet.add(2);
        intSet.add(9);
        intSet.add(1);
        System.out.println(intSet);
    }
}

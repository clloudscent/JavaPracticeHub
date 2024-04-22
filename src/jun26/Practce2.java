package jun26;

import assignment.Student;

public class Practce2 {
    public static void main(String[] args) {
        Integer intNum = new Integer(34);
        String text = "임꺽정";
        text = "홍길동";
        int num = 34;

        boolean check = false;


        Student std3 = new Student("홍길동", 13, 6);
        Student std = new Student("홍길동", 13, 6);
        Student std2 = new Student("홍길동", 13, 6);
        System.out.println(intNum.toString());
        System.out.println(std.toString());
        System.out.println(std2.toString());
    }
}

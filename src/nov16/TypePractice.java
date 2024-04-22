package nov16;

import oct16.Student;

public class TypePractice {
    public static void main(String[] args) {
        Student std = new Student("홍길동", "20231111");
        System.out.println(std.getName());
        checkName(std);
        System.out.println(std.getName());

        int originalNum = 7;
        System.out.println(originalNum);
        changeNum(originalNum);
        System.out.println(originalNum);
    }

    public static void changeNum(int num){
        num = 5;
    }

    public static void checkName(Student std){
      std.setName("임꺽정");
    }
}

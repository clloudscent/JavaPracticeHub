package jun26;

import assignment.Student;

public class Practice {
    public static void main(String[] args) {
        String text= "hello";
        Student std = new Student("홍길동", 13, 6);
        int num = 6;
        String introduceComment = std.introduce();
        int num2 = 8;
        std.getInfo();
        String text2 = "안녕하세요 반갑습니다.";

        String strObject =new String("test");
        strObject = null;

        int result = 4+7+2*3-6+sum(1,3);

        for(int i=0; i<1000000;i++){
            std.introduce();
        }
    }

    public static int sum(int num1, int num2){
        return num1+num2;
    }

    public static int minus(int num1, int num2){
        return num1-num2;
    }
}

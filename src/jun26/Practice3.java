package jun26;

import assignment.Student;

public class Practice3 {

    public static void main(String[] args) {
        String text = "안녕하세요. 자바 개발자 입니다.";
        String text2 = text;
        System.out.println(text==text2);
        text = text.replace("자바", "JAVA");
        System.out.println(text==text2);
        //"안녕하세요. JAVA 개발자 입니다."
        System.out.println("=======");
        Student std1 = new Student("홍길동", 13, 6);
        Student std2 = std1;
        System.out.println(std1==std2);

        std1 = std1.changeName("임꺽정");
        System.out.println(std1==std2);

    }

}

package May30;

public class RefPractice {
    public static void main(String[] args) {
        StudentInfo std = new StudentInfo();
        std.name = "홍길동";
        std.score = 90;

        StudentInfo std2 = std;
        std2.name = "임꺽정";

        System.out.println(std.name);

    }
}

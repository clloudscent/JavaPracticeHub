package oct3;

public class Practice {
    public static void main(String[] args) {
        Student2 std = new Student2(1, "홍길동");
        Student2 std2 = new Student2(1, "홍길동");
        System.out.println(std.hashCode());
        System.out.println(std2.hashCode());
    }
}

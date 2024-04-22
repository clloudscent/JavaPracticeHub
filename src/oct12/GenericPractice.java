package oct12;

import java.util.ArrayList;
import java.util.List;

public class GenericPractice {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        Student std = new Student().id("202301")
                .name("홍길동");

        std.getName();

        Object obj = std;

        Student st2 = (Student)obj;



    }
}

package jun21;

import thisIsJava.ch06.Student;

import java.util.ArrayList;
import java.util.List;

public class Practice {
    final static double PI = 3.14159;
    public static void main(String[] args) {
        int num= 7;
        num = 4;
        Student student = new Student();
        Student std2 = student;
        String name = new String("신용권");
        String name2 = new String("신용권");
        System.out.println(name==name2);
        String name3 = "신용권";
        String name4 = "신용권";
        System.out.println(name3==name4);
        System.out.println(PI);

        String text = "APPLE";
        String convertedText = text.toLowerCase();
        String text2 = null;
        System.out.println(text);
        System.out.println(convertedText);

        student = null;
        std2 = null;
        //
        List<Student> stdList = new ArrayList<>();
        for(int i=0; i<1000000000;i++){
            stdList.add(new Student());
            System.out.println("test"+i);
        }

    }
}

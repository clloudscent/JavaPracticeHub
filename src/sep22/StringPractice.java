package sep22;

import java.util.List;

public class StringPractice {
    public static void main(String[] args) {
        String text = "홍길동20230122임꺽정20230729";
        String name = text.substring(0, 3);
        System.out.println("name: "+name);
        String studentNo = text.substring(3, 9);
        System.out.println("studentNo: "+studentNo);
        String age = text.substring(9, 11);
        System.out.println("age: "+age);
        text = text.substring(11);
        System.out.println(text);

        text = "홍길동,202302,22\n임꺽정,202020,20\n김둘리,200000,7";
        String[] studentStringList = text.split("\n");
        for(int i=0;i< studentStringList.length;i++){
            String studentText = studentStringList[i];
            System.out.println(studentText);

            String[] studentInfo = studentText.split(",");
            System.out.println("name : "+studentInfo[0]);
            System.out.println("studentNo: "+studentInfo[1]);
            System.out.println("age: "+studentInfo[2]);
        }
    }
}

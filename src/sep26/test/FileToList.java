package sep26.test;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileToList {
    //파일안에 학생데이터를 넣는다 fileWriter
    //학생데이터를 리스트에 담는다
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("/Users/mac/javapractice/student.txt", true);
        fw.write("홍길동");
        fw.write(",");
        fw.write("202301");
        fw.write(",");
        fw.write("20");
        fw.write("\n");
        fw.write("신짱구");
        fw.write(",");
        fw.write("202311");
        fw.write(",");
        fw.write("22");
        fw.write("\n");

        //현재 파일안에 데이터가 들어가 있음


        //홍길동,202301,20
        //신짱구,202311,22


        //Path 객체 생성
        String fileName = "/Users/mac/javapractice/student.txt";
        Path filePath = Path.of(fileName);

        //content 안에 파일안에 들어있는 데이터 객체를 담는다
        //줄바꿈을 기준으로 split() 사용하여 분류하여 학생별 데이터 분류하기
        String content = Files.readString(filePath);
        String[] studentList = content.split("\n");

        //학생 리스트를 만들기
        List<Student> studentArrayList = new ArrayList<>();

        //split 로 분류된 i 번째의 학생 데이터(이름,학번,나이)를 ","로 또 한번 이름, 학번, 나이로 분류하여 분류된 데이터를 차례로
        //student 객체안의 이름,학번, 나이에 넣고
        //리스트에 학생객체를 add 한다.
        for(int i =0; i<studentList.length; i++){
            String studentText = studentList[i];
            String[] studentInfo = studentText.split(",");
            System.out.println("이름: " + studentInfo[0]);
            System.out.println("학번: " + studentInfo[1]);
            System.out.println("나이: " + studentInfo[2]);
            Student std = new Student();
            std.name = studentInfo[0];
            std.studentCode = studentInfo[1];
            std.age = studentInfo[2];
            studentArrayList.add(std);
        }

        //리스트를 돌면서 데이터가 잘 입력되어있는지 확인
        for(int i =0; i<studentArrayList.size(); i++){
            System.out.println("이름: "+studentArrayList.get(i).name);
            System.out.println("학번: "+studentArrayList.get(i).studentCode);
            System.out.println("나이: "+studentArrayList.get(i).age);
        }
    }
}

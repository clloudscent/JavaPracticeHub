package sep22;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesPractice{
    public static void main(String[] args) throws Exception {

        readFile();

    }

    public static void readFile()throws Exception{
        //Files 라이브러리는 Path 객체와 항상 세트로 다닌다.
        //Path 객체를 만들기 위해 경로 값을 문자열에 담아준다.
        String filePathString = "/Users/mac/javapractice/student.txt";
        //앞서 담은 문자열을 Paths.get()메소드에 인자로 넣어주면 해당 경로를 기반으로 하는 Path객체가 만들어진다.
        Path filePathToRead = Paths.get(filePathString);

        //파일안에 있는 내용을 바이트형태로 모두 읽어오는 메소드. 이렇게 읽어온 데이터는 String으로 변환해줘야 한다.
//        String content = new String(Files.readAllBytes(filePathToRead));
//        System.out.println(content);

        List<String> contentList = Files.readAllLines(filePathToRead);

        System.out.println(contentList.get(1));
    }

    public static void writeFile()throws Exception{
        //Files 라이브러리는 Path 객체와 항상 세트로 다닌다.
        //Path 객체를 만들기 위해 경로 값을 문자열에 담아준다.
        String filePathString = "/Users/mac/javapractice/student.txt";
        //앞서 담은 문자열을 Paths.get()메소드에 인자로 넣어주면 해당 경로를 기반으로 하는 Path객체가 만들어진다.
        Path filePathToWrite = Paths.get(filePathString);
        // 파일에 저장할 내용을 String 타입의 변수에 저장해주낟.
        String content = "홍길동 202301 25\n임꺽정 202302 22";
        //Files.write 메소드로 파일을 생성해주는데, 첫번째 인자로 생성하고자 하는 파일의 경로 객체인 Path 객체를, 두번째 인자로는 저장할 내용을 bytes형태로 변환해서 넣어주면 파일이 생성된다.
        Files.write(filePathToWrite, content.getBytes(StandardCharsets.UTF_8));

    }
}

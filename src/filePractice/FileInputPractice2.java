package filePractice;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileInputPractice2 {
    public static void main(String[] args) throws Exception{
        Path inputPath = Paths.get("/Users/mac/filepractice/file2.txt");
        List<String> contentList = Files.readAllLines(inputPath);
        /*for(String content : contentList){
            System.out.println(content);
        }*/
        String content = new String(Files.readAllBytes(inputPath));
        System.out.println(content);
    }
}

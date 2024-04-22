package filePractice;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileOutputPractice2 {
    public static void main(String[] args) throws Exception{
        Path outputPath = Paths.get("/Users/mac/filepractice/file2.txt");
        String content = "Hello World";
        Files.write(outputPath, content.getBytes());
    }

}

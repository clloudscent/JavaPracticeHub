package jul24;

import javax.annotation.processing.FilerException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Parent {
    public void getFileInfo(String filePathString)throws IOException{
        try {
            List<String> fileLines = Files.readAllLines(Paths.get(filePathString));
            int lineSize = fileLines.size();
            //...
            //...
            //..
            System.out.println("해당 파일의 라인수는 " + lineSize + "입니다.");
        }catch (IOException e){
            throw e;
        }
    }
}

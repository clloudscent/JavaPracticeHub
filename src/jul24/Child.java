package jul24;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Child extends Parent{
    @Override
    public void getFileInfo(String filePathString)throws IOException, ArithmeticException{
    try {

//        super.getFileInfo(filePathString);
        List<String> fileLines = Files.readAllLines(Paths.get(filePathString));
        int lineSize = fileLines.size();
        //...
        //...
        //..
        System.out.println("해당 파일의 라인수는 " + lineSize + "입니다.");



//        fileLines.
        //
        //
        //
    }catch (IOException e){
        throw e;
    }catch (ArithmeticException e){
        throw e;
    }

    }
}

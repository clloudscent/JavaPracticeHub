package sep22;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathPractice {
    public static void main(String[] args) {
        String filePathString = "/Users/mac/javapractice/student.txt";
        Path targetPath = Paths.get(filePathString);

        System.out.println(targetPath.getFileName());

        System.out.println(targetPath.getParent());


        String baseDirPathString = "/Users/mac/javapractice";
        Path baseDirPath = Paths.get(baseDirPathString);
        String fileNamePathString = "temp.txt";
        Path fileNamePath = Paths.get(fileNamePathString);

        System.out.println(baseDirPath.resolve(fileNamePath).toString());

        System.out.println(Files.isDirectory(baseDirPath));

        System.out.println(Files.isDirectory(targetPath));


    }
}

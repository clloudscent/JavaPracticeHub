package TCPPracticeMay04;

import java.io.File;

public class FileListExample {
    public static void main(String[] args) {
        String dirPath = "/Users/mac/filepractice";
        File dir = new File(dirPath);

        File[] files = dir.listFiles();
        if(files!=null){
            for(File file : files){
                if(file.isFile()){
                    System.out.println(file.getName());
                    System.out.println(file.getPath());
                }
            }
        }
    }
}

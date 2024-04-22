package filePractice;

import java.io.FileInputStream;

public class FileInputPractice {

    public static void main(String[] args) {
        String filePath = "/Users/mac/filepractice/file.txt";
        try(FileInputStream fis = new FileInputStream(filePath)){
            int data;
            while((data = fis.read()) != -1){
                System.out.println((char) data);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}

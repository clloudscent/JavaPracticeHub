package filePractice;

import java.io.FileOutputStream;

public class FileOutputPractice {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        String filePath = "/Users/mac/filepractice/file.txt";
        String data = "Hello World";
       /* try {


            fileOutputStream = new FileOutputStream(filePath);



            fileOutputStream.write(data.getBytes());

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            fileOutputStream.close();
        }*/

        try(FileOutputStream fileOutputStream2 = new FileOutputStream(filePath)){
            fileOutputStream2.write(data.getBytes());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

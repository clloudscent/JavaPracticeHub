package sep21;

import sep05.exception.MyResource;

import java.io.IOException;

public class No08 {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("file.txt") ){
            fw.write("Java");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

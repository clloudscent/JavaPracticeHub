package filePractice;

import java.io.*;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        int port = 9898;
        Socket socket = new Socket("localhost", port);
        String file = "/Users/mac/filepractice/file.txt";
        FileInputStream fis = new FileInputStream(file);

        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

        byte[] bytes = new byte[4096];
        int byteRead;
        int cnt = 0;
        while((byteRead=fis.read(bytes))!=-1){
            dos.write(bytes,0,byteRead);
        }

    }
}

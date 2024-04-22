package filePractice;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        int port = 9898;
        ServerSocket serverSocket = new ServerSocket(port);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        DataInputStream dis = new DataInputStream(inputStream);
        FileOutputStream fos = new FileOutputStream("/Users/mac/filepractice/receivedFile.txt");

        byte[] bytes = new byte[4096];
        int byteRead;
        int cnt = 0;
        while ((byteRead=dis.read(bytes))!=-1){
            fos.write(bytes,0,byteRead);
        }
    }
}

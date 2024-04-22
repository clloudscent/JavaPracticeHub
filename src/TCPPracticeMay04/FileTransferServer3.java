package TCPPracticeMay04;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class FileTransferServer3 {
    public static void main(String[] args) throws IOException {
        int port = 9898;
        ServerSocket serverSocket = new ServerSocket(port);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String fileName = bufferedReader.readLine();
        DataInputStream dis = new DataInputStream(inputStream);
        FileOutputStream fos = new FileOutputStream("/Users/mac/filepractice/"+ fileName);
        byte[] buffer = new byte[4096];
        int bytesRead;
        while ((bytesRead = dis.read(buffer))!=-1){
            fos.write(buffer,0,bytesRead);

        }

        System.out.println("파일 저장 완료");

    }
}

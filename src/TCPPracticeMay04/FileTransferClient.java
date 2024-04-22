package TCPPracticeMay04;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

public class FileTransferClient {
    public static void main(String[] args) {
        String serverAddress = "localhost";
        int port = 9898;
        String filePath = "/Users/mac/filepractice/file.txt";

        try(Socket socket = new Socket(serverAddress, port);
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            FileInputStream fis = new FileInputStream(filePath)){

            System.out.println("Server Connected");

            int bytesRead;
            byte[] buffer = new byte[4096];

            while ((bytesRead = fis.read(buffer))!= -1){
                dos.write(buffer, 0, bytesRead);
            }
            System.out.println("파일 전송 완료");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

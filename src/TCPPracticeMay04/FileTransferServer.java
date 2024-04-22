package TCPPracticeMay04;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class FileTransferServer {
    public static void main(String[] args) {
        int port = 9898;

        try(ServerSocket serverSocket = new ServerSocket(port)){
            System.out.println("Server Started");

            try(Socket clientSocket = serverSocket.accept();
                DataInputStream dis = new DataInputStream(clientSocket.getInputStream());
                FileOutputStream fos = new FileOutputStream("/Users/mac/filepractice/receivedFile.txt")){

                System.out.println("Client Connected");

                int bytesRead;
                byte[] buffer = new byte[4096];

                while((bytesRead = dis.read(buffer)) != -1){
                    fos.write(buffer, 0, bytesRead);
                }
                System.out.println("File Received Completed");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

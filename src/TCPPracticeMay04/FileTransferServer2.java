package TCPPracticeMay04;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class FileTransferServer2 {
    public static void main(String[] args) {
        int port = 9898;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server Started");
            Socket clientSocket = serverSocket.accept();
            InputStream inputStream = clientSocket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String fileName = bufferedReader.readLine();
            DataInputStream dis = new DataInputStream(clientSocket.getInputStream());
            FileOutputStream fos = new FileOutputStream("/Users/mac/filepractice/"+fileName);

            System.out.println("Client Connected");

            int bytesRead;
            byte[] buffer = new byte[4096];

            while ((bytesRead = dis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            System.out.println("File Received Completed");

            fos.close();
            dis.close();
            clientSocket.close();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}

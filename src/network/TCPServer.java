package network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9898);
        System.out.println("Server Started");

        while(true){
            Socket clientSocket = serverSocket.accept();
            System.out.println("Connected");

            InputStream inputStream = clientSocket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String message = bufferedReader.readLine();
            System.out.println("Received Message: "+message);

            OutputStream outputStream = clientSocket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream);
            printWriter.print("메시지 정상 수신");
            printWriter.flush();

            clientSocket.close();
        }
    }
}

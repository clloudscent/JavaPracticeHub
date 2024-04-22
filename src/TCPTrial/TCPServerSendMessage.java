package TCPTrial;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerSendMessage {
    public static void main(String[] args) throws IOException {
        int port = 9898;
        ServerSocket serverSocket = new ServerSocket(port);
        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);

        String messageFromServer = bufferedReader.readLine();
        if(messageFromServer.equals("helloWorld")){
            printWriter.println("helloWorld");
            printWriter.flush();
        }else{
            printWriter.println("goodBye");
            printWriter.flush();
        }

    }
}

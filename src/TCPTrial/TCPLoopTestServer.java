package TCPTrial;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPLoopTestServer {
    public static void main(String[] args) throws IOException {
        int port = 9898;
        ServerSocket serverSocket = new ServerSocket(port);
        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);
        Scanner sc = new Scanner(System.in);

        boolean isRunnable = false;

        while (!isRunnable){
            System.out.print("보낼메세지: ");
            String messageToClient =sc.nextLine();
            printWriter.println(messageToClient);
            printWriter.flush();

            if(messageToClient.equals("hello")){
                String messageFromClient = bufferedReader.readLine();
                System.out.println("메세지(from Client): "+messageFromClient);
            }

            if(messageToClient.equals("helloWorld")){
                String messageFromClient = bufferedReader.readLine();
                System.out.println("메세지(from Client): "+messageFromClient);
                if(messageFromClient.equals("hihi")){
                    printWriter.println(messageFromClient);
                    printWriter.flush();
                }
            }
        }
    }
}

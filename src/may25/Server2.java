package may25;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server2 {
    public static void main(String[] args) throws IOException {
        int port = 9898;
        ServerSocket serverSocket = new ServerSocket(port);
        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);

        Scanner sc = new Scanner(System.in);

        boolean runnable  = true;
        while(runnable){
            String message = sc.nextLine();
            printWriter.println(message);
            printWriter.flush();
            if(message.equals("exit")){
                break;
            }
            if(message.equals("구구단")){
                System.out.println("몇단을 출력하시겠습니까");
                message = sc.nextLine();
                printWriter.println(message);
                printWriter.flush();
            }
        }

        socket.close();
    }
}

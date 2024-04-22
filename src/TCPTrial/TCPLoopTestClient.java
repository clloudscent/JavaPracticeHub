package TCPTrial;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TCPLoopTestClient {
    public static void main(String[] args) throws IOException {
        int port = 9898;
        Socket socket = new Socket("localhost",port);

        InputStream inputStream =socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);

        Scanner sc = new Scanner(System.in);

        boolean isRunnable = false;
        while(!isRunnable){
            String messageFromServer =  bufferedReader.readLine();
            System.out.println(messageFromServer);
            if(messageFromServer.equals("hello")){
                printWriter.println("hello");
                printWriter.flush();
            }
            if(messageFromServer.equals("helloWorld")){
                printWriter.println(sc.nextLine());
                printWriter.flush();
            }

        }
    }
}

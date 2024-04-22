package TCPTrial;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TCPClientSendMessage {
    public static void main(String[] args) throws IOException {
        int port = 9898;
        Socket socket = new Socket("localhost",port);

        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);

        Scanner sc = new Scanner(System.in);

        System.out.print("서버로 보낼 메세지: ");
        printWriter.println(sc.nextLine());
        printWriter.flush();

        String messageFromServer = bufferedReader.readLine();

        System.out.print("서버로부터의 메세지: ");
        System.out.println(messageFromServer);


    }
}

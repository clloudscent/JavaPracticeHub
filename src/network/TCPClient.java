package network;

import java.io.*;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        //121.184.145.55
        Socket socket = new Socket("localhost", 9898);
        System.out.println("서버에 연결 되었습니다.");



        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);
        printWriter.println("안녕하세요 -클라이언트");
        printWriter.flush();

        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String message = bufferedReader.readLine();
        System.out.println("서버로부터 수신한 메시지: "+message);

        socket.close();
    }
}

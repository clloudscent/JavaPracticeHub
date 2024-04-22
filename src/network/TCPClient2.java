package network;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient2 {
    public static void main(String[] args) throws IOException {
        //121.184.145.55
        Socket socket = new Socket("121.184.145.55", 9898);
        System.out.println("서버에 연결 되었습니다.");

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("전달할 메시지 입력: ");
            String message = sc.nextLine();


            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream);
            printWriter.println(message);
            printWriter.flush();

            InputStream inputStream = socket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String messageFromServer = bufferedReader.readLine();
            System.out.println("서버로부터 수신한 메시지: " + messageFromServer);

            if(message.equals("exit")||messageFromServer.equals("exit")){
                break;
            }
        }
        socket.close();
    }
}

package filePractice;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public Server(String localhost, int i) {
    }

    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(9898);
        //서버연결


        //클라이언트와 연결
        Socket socket1 = socket.accept();
        InputStream inputStream = socket1.getInputStream();
        OutputStream outputStream = socket1.getOutputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        //printWriter로 id, pw 받아옴
        PrintWriter printWriter = new PrintWriter(outputStream);
        /*rintWriter.println("USERID:");
        printWriter.flush();*/
        String id = bufferedReader.readLine();

        /*printWriter.println("PW:");
        printWriter.flush();*/
        String pw = bufferedReader.readLine();

        if(id.equals("admin") && pw.equals("4321")){
            printWriter.println("환영합니다.");
        }else{
            printWriter.println("잘못입력하셨습니다.");
        }
        printWriter.flush();
        socket.close();
        socket1.close();
    }
}

package tcpPractice;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9898);
        while(true){
            Socket socket = serverSocket.accept();

            InputStream inputStream = socket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String id = bufferedReader.readLine();
            System.out.println(id);
            String pw = bufferedReader.readLine();
            System.out.println(pw);

            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream);
            if(id.equals("admin")&&pw.equals("4321")){
                printWriter.println("환영합니다.");
            }else{
                printWriter.println("다시입력햐주세요");
            }
            printWriter.flush();
            socket.close();
        }

    }
}

package filePractice;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(9898);
        Socket socket1  = socket.accept();
        InputStream inputStream = socket1.getInputStream();
        OutputStream outputStream = socket1.getOutputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        PrintWriter printWriter = new PrintWriter(outputStream);

        boolean isRunnable = true;

        while(true){
            String id = bufferedReader.readLine();
            if(id.equals("admin")){
                break;
            }else{
                printWriter.println("아이디를 재입력해주세요");
            }
        }



    }
}

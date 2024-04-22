package TCPPracticeMay04;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9898);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);

        String id = "";
        int status = 0;
        while (true) {
            if(status==0){
                printWriter.println("id");
                printWriter.flush();
                id = bufferedReader.readLine();
                if(id.equals("admin")){
                    status++;
                }
            }else if(status==1){
                printWriter.println("password");
                printWriter.flush();
                String password = bufferedReader.readLine();
                if(password.equals("4321")){
                    status++;
                }
            }else if(status==2){
                printWriter.println("loginSuccess");
                printWriter.flush();
                break;
            }
        }
        socket.close();
    }
}

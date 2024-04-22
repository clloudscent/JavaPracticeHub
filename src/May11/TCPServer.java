package May11;

import tcpPracticeMay08.Server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        int port = 9898;
        ServerSocket serverSocket = new ServerSocket(port);
        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);

        int status = 0;
        int count = 0;
        String id = "";
        String pw = "";
        int firstTrial = 0;

        while (true){
            if(count>=5){
                printWriter.println("loginFailed");
                printWriter.flush();
                break;
            }else if(status==0){
                if(firstTrial==0){
                    printWriter.println("id");
                    printWriter.flush();
                    firstTrial++;
                }
                id = bufferedReader.readLine();
                if(id.equals("admin")){
                    status++;
                    firstTrial=0;
                }else{
                    printWriter.println("reId");
                    printWriter.flush();
                    count++;
                }

            }else if(status==1){
                if(firstTrial==0){
                    printWriter.println("pw");
                    printWriter.flush();
                    firstTrial++;
                }
                pw = bufferedReader.readLine();
                if(pw.equals("4321")){
                    status=100;
                    firstTrial=0;
                }else{
                    printWriter.println("rePw");
                    printWriter.flush();
                    count++;
                }
            }else if(status==100){
                printWriter.println("loginSuccess");
                printWriter.flush();
                break;
            }
        }
        socket.close();
    }
}

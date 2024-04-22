package TCPPracticeMay04;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer_REF {
    public static void main(String[] args) throws IOException {
        int port = 9898;
        ServerSocket serverSocket = new ServerSocket(port);
        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader =  new BufferedReader(new InputStreamReader(inputStream));

        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);

        int status = 0;
        int wrongTrial = 0;

        while(true){
            if(wrongTrial>=5){
                printWriter.println("loginFailed");
                printWriter.flush();
                break;
            }else if(status==0){
                printWriter.println("id");
                printWriter.flush();
                String id = bufferedReader.readLine();
                if(id.equals("admin")){
                    status++;
                }else{
                    wrongTrial++;
                }
            }else if(status==1){
                printWriter.println("password");
                printWriter.flush();
                String pw = bufferedReader.readLine();
                if(pw.equals("4321")){
                    status+=2;
                }else{
                    wrongTrial++;
                    status++;
                }
            }else if(status==2){
                printWriter.println("wrongPassword");
                printWriter.flush();
                printWriter.println(wrongTrial);
                printWriter.flush();

                String pw = bufferedReader.readLine();
                if(pw.equals("4321")){
                    status++;
                }else{
                    wrongTrial++;
                }

            }else if(status==3){
                printWriter.println("loginComplete");
                printWriter.flush();
                break;
            }
        }
        socket.close();
    }
}

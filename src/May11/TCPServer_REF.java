package May11;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer_REF {
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

        while (true) {
            if (count >= 5) {
                printWriter.println("loginFailed");
                printWriter.flush();
                break;
            } else if (status == 0) {
                printWriter.println("id");
                printWriter.flush();

                id = bufferedReader.readLine();
                if (id.equals("admin")) {
                    status = 2;
                } else {
                    count++;
                    status = 1;
                }
            } else if (status == 1) {
                printWriter.println("reId");
                printWriter.flush();

                id = bufferedReader.readLine();
                if (id.equals("admin")) {
                    status = 2;
                } else {
                    count++;
                }
            } else if (status == 2) {
                printWriter.println("pw");
                printWriter.flush();

                pw = bufferedReader.readLine();
                if (pw.equals("4321")) {
                    status = 4;
                } else {
                    count++;
                    status=3;
                }
            }else if(status==3){
                printWriter.println("rePw");
                printWriter.flush();

                pw = bufferedReader.readLine();
                if (pw.equals("4321")) {
                    status = 4;
                } else {
                    count++;
                }
            }else if (status==4) {
                printWriter.println("loginSuccess");
                printWriter.flush();
                break;
            }
        }
        socket.close();
    }
}

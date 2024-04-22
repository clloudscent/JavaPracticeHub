package TCPPracticeMay04;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9898);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);

        String id = "";
        int status = 0;
        int failCount = 0;
        while (true) {
            if (failCount > 5) {
                printWriter.println("loginFailed");
                printWriter.flush();
                break;
            } else if (status == 0) {
                printWriter.println("id");
                printWriter.flush();
                id = bufferedReader.readLine();
                if (id.equals("admin")) {
                    status++;
                }else{
                    failCount++;
                }
            } else if (status == 1) {
                printWriter.println("password");
                printWriter.flush();
                String password = bufferedReader.readLine();
                if (password.equals("4321")) {
                    status++;
                }else{
                    failCount++;
                }
            } else if (status == 2) {
                printWriter.println("loginSuccess");
                printWriter.flush();
                break;
            }
        }
        socket.close();
    }
}


package TCPTrial;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class No_3LogInServer {
    public static void main(String[] args) throws IOException {
        int port = 9898;
        String id = "admin";
        String pw = "4321";
        ServerSocket serverSocket = new ServerSocket(port);
        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);

        int caseNum = 1;
        boolean loggedIn = false;

        while (!loggedIn) {
            String fromClient = bufferedReader.readLine();
            switch (caseNum) {
                case 1:
                    printWriter.println("id");
                    printWriter.flush();
                    if (fromClient.equals(id)) {
                        caseNum=3;
                        printWriter.println("pw");
                        printWriter.flush();
                    } else {
                        caseNum=2;
                        printWriter.println("wrongIdTrial");
                        printWriter.flush();
                    }
                    break;

                case 2:
                    printWriter.println("id");
                    caseNum = 1;
                    printWriter.flush();
                    break;

                case 3:
                    if(fromClient.equals(pw)){
                        caseNum=5;
                    }else{
                        caseNum=4;
                        printWriter.println("wrongPwTrial");
                    }
                    printWriter.flush();
                    break;

                case 4:
                    printWriter.println("pw");
                    caseNum = 3;
                    printWriter.flush();
                    break;

                case 5:
                    printWriter.println("loggedIn");
                    loggedIn = true;
                    printWriter.flush();
                    break;
            }
        }
    }
}

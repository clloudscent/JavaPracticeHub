package tcpPracticeMay08;

import java.io.*;
import java.net.ServerSocket;

public class Server_REF {
    public static void main(String[] args) throws IOException {
        String id = "admin";
        String pw = "4321";
        String basePath = "";
        int ip = 9898;
        ServerSocket serverSocket = new ServerSocket(ip);
        java.net.Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);

        int status = 0;
        String idFromServer = "";
        String pwFromServer = "";
        while(true){
            if(status==0){
                printWriter.println("id");
                printWriter.flush();
                idFromServer = bufferedReader.readLine();
                if(idFromServer.equals(id)){
                    status=1;
                }
            } else if (status==1) {
                printWriter.println("pw");
                printWriter.flush();
                pwFromServer = bufferedReader.readLine();
                if(pwFromServer.equals(pw)){
                    status=2;
                }
            } else if(status==2){
                break;
            }
        }

        printWriter.println("needFilePath");
        printWriter.flush();
        String filePathFromClient  = bufferedReader.readLine();


        printWriter.println("needFileName");
        printWriter.flush();
        String fileName =  bufferedReader.readLine();
        DataInputStream dis = new DataInputStream(inputStream);
        FileOutputStream fos = new FileOutputStream(filePathFromClient+fileName);

        int byteReaderInt;
        byte[] buffer = new byte[4096];
        boolean byteReader;

        while((byteReaderInt = dis.read(buffer))!=-1) {
            fos.write(buffer,0,byteReaderInt);
        }

        System.out.println("파일저장완료");

    }
}

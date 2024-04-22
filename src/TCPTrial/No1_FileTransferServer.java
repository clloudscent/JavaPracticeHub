package TCPTrial;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class No1_FileTransferServer {
    public static void main(String[] args) throws IOException {
        int port = 9898;
        ServerSocket serverSocket = new ServerSocket(port);
        Socket socket = serverSocket.accept();
        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);

        InputStream inputStream = socket.getInputStream();
        DataInputStream dis = new DataInputStream(inputStream);



        printWriter.println("fileName");
        printWriter.flush();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String fileName = bufferedReader.readLine();
        FileOutputStream fos = new FileOutputStream("/Users/mac/filepractice/"+fileName);

        byte[] buffer = new byte[4096];
        int byteRead;
        while((byteRead=dis.read(buffer))!=-1){
            fos.write(buffer,0,byteRead);
        }
        System.out.println(fileName+"으로 파일저장완료");
    }
}

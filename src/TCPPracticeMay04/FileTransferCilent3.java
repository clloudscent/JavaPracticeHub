package TCPPracticeMay04;

import javax.imageio.IIOException;
import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class FileTransferCilent3 {
    public static void main(String[] args) throws IOException {
        int port = 9898;
        Socket socket = new Socket("localhost", port);
        String file = "/Users/mac/filepractice/newWorld.txt";
        FileInputStream fis = new FileInputStream(file);
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();
        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);
        printWriter.println(fileName);
        printWriter.flush();
        DataOutputStream dos = new DataOutputStream(outputStream);
        byte[] bytes = new byte[4096];
        int bytesRead;
        while((bytesRead=fis.read(bytes))!=-1){
            dos.write(bytes,0,bytesRead);
        }
        System.out.println("파일 전송 완ㅣ");
    }
}

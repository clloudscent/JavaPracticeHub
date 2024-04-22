package TCPPracticeMay04;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class FileTransferClient2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String serverAddress = "localhost";
        int port = 9898;
        System.out.print("파일이름: ");
        String fileName = sc.nextLine();
        System.out.print("파일경로: ");
        String filePath = sc.nextLine();
        Socket socket = new Socket(serverAddress, port);
        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);
        printWriter.println(fileName);
        printWriter.flush();
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

        FileInputStream fis = new FileInputStream(filePath);

        System.out.println("Server Connected");

        int bytesRead;
        byte[] buffer = new byte[4096];

        while ((bytesRead = fis.read(buffer)) != -1) {
            dos.write(buffer, 0, bytesRead);
        }
        System.out.println("파일 전송 완료");

    }
}

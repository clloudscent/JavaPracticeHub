package TCPTrial;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class No1_FileTransferClient {
    public static void main(String[] args) throws IOException {
        int port = 9898;
        Socket socket = new Socket("localhost",9898);
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        String messageFromServer = bufferedReader.readLine();
        System.out.println(messageFromServer);

        String filePath = "/Users/mac/filepractice/newWorld.txt";
        FileInputStream fis = new FileInputStream(filePath);

        OutputStream outputStream = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(outputStream);

        byte[] bytes = new byte[4096];
        int byteRead;
        while((byteRead=fis.read(bytes))!=-1){
            dos.write(bytes,0,byteRead);
        }
        System.out.println("파일전송완");

        Scanner sc = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(outputStream);
        if(bufferedReader.readLine().equals("fileName")){
            System.out.print("파일이름: ");
            String filename = sc.nextLine();
            printWriter.println(filename);
            printWriter.flush();
        }

    }
}

package filePractice;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    //1. server의 소켓통신 연결
    //2. server는 client에게 userid와 password 요청
    //3. client는 userid와 password 입력

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 9898);
        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        Scanner sc = new Scanner(System.in);
        System.out.print("UserID:");
        String userId = sc.nextLine();
        printWriter.println(userId);
        printWriter.flush();

        System.out.print("PW:");
        String pw = sc.nextLine();
        printWriter.println(pw);
        printWriter.flush();

        System.out.println(bufferedReader.readLine());
        socket.close();


    }

}

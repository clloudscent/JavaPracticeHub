package TCPPracticeMay04;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TCPCilent {
    public static void main(String[] args) throws IOException {
        int port = 9898;
        Socket socket = new Socket("localhost", port);
        Scanner sc = new Scanner(System.in);

        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);
        boolean isRunnable = true;
        while (isRunnable) {
            String statusCode = bufferedReader.readLine();
            switch (statusCode) {
                case "id":
                    System.out.print("아이디: ");
                    printWriter.println(sc.nextLine());
                    printWriter.flush();
                    break;

                case "wrongPassword":
                    String wrongTrial = bufferedReader.readLine();
                    System.out.println("잘못된 비밀번호입니다. " + wrongTrial);

                case "password":
                    System.out.print("비밀번호: ");
                    printWriter.println(sc.nextLine());
                    printWriter.flush();
                    break;

                case "loginComplete":
                    System.out.println("로그인완료");
                    break;

                case "loginFailed":
                    System.out.println("로그인 실패");
                    isRunnable = false;
                    break;
            }
        }
    }
}

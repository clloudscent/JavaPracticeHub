package TCPPracticeMay04;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Cilent2 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 9898);
        Scanner sc = new Scanner(System.in);

        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);

        int count = 0;
        while (true) {
            String statusCode = bufferedReader.readLine();
            if (bufferedReader.readLine().equals("loginFailed")) {
                System.out.println("로그인에 실패했습니다.");
                break;
            } else if (statusCode.equals("id")) {
                System.out.print("아이디:");
                printWriter.println(sc.nextLine());
                printWriter.flush();
            } else if (statusCode.equals("password")) {
                System.out.print("비밀번호:");
                printWriter.println(sc.nextLine());
                printWriter.flush();
            }else if (statusCode.equals("loginSuccess")) {
                System.out.println("로그인이 정상적으로 됐습니다");
                break;
            }
        }
        socket.close();
    }
}

package May11;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        int port = 9898;
        Socket socket = new Socket("localhost",port);
        Scanner sc = new Scanner(System.in);

        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);

        while (true) {
            String status = bufferedReader.readLine();
            if (status.equals("loginFailed")) {
                System.out.println("로그인실패");
                break;
            }else if(status.equals("reId")){
                System.out.println("아이디를 다시 입력해주세요!");
                System.out.print("reID: ");
                printWriter.println(sc.nextLine());
                printWriter.flush();
            }else if(status.equals("rePw")){
                System.out.println("비밀번호를 다시 입력해주세요!");
                System.out.println("rePW: ");
                printWriter.println(sc.nextLine());
                printWriter.flush();
            }else if (status.equals("id")) {
                System.out.print("ID: ");
                printWriter.println(sc.nextLine());
                printWriter.flush();
            }else if (status.equals("pw")) {
                System.out.print("PW: ");
                printWriter.println(sc.nextLine());
                printWriter.flush();
            }else if (status.equals("loginSuccess")) {
                System.out.println("로그인성공");
                break;
            }

        }
        socket.close();
    }
}

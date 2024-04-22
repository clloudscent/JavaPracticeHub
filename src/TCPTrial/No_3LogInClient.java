package TCPTrial;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class No_3LogInClient {
    public static void main(String[] args) throws IOException {
        int port = 9898;
        Socket socket = new Socket("localhost",port);

        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);

        Scanner sc = new Scanner(System.in);
        int wrongTrial = 0;
        boolean loggedIn = false;

        while(!loggedIn){
            String fromServer = bufferedReader.readLine();
            switch (fromServer){
                case "id":
                    System.out.print("아이디: ");
                    printWriter.println(sc.nextLine());
                    printWriter.flush();
                    break;

                case "pw":
                    System.out.print("비밀번호: ");
                    printWriter.println(sc.nextLine());
                    printWriter.flush();
                    break;

                case "wrongIdTrial":
                    System.out.println("존재하지않는아이디입니다.");
                    printWriter.println(sc.nextLine());
                    printWriter.flush();
                    break;

                case "wrongPwTrial":
                    wrongTrial++;
                    if(wrongTrial>=5){
                        System.out.println("비밀번호입력횟수초과");
                        return;
                    }
                    System.out.println("비밀번호재입력: ");
                    printWriter.println(sc.nextLine());
                    printWriter.flush();
                    break;

                case "loggedIn":
                    System.out.println("로그인성공");
                    loggedIn = true;
                    break;
            }
        }
    }
}

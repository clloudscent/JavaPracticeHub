package tcpPractice;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Cilent2 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",9898);
        Scanner sc = new Scanner(System.in);
        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter =  new PrintWriter(outputStream);

        System.out.print("아이디:" );
        printWriter.println(sc.nextLine());
        printWriter.flush();
        System.out.print("비밀번호:" );
        printWriter.println(sc.nextLine());
        printWriter.flush();

        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String message = bufferedReader.readLine();
        System.out.println("서버로부터의 메세지: "+message);
        socket.close();
    }
}

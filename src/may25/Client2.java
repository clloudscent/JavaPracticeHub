package may25;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
    public static void main(String[] args) throws IOException {
        int port = 9898;
        Socket socket = new Socket("localhost",port);

        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);
        Scanner sc = new Scanner(System.in);

        boolean runnable = true;
        while(runnable){
            String messageFromServer = bufferedReader.readLine();
            if(messageFromServer.equals("exit")){
                break;
            }
            if(messageFromServer.equals("구구단")){
                String gugudanLevel = bufferedReader.readLine();
                int num = Integer.parseInt(gugudanLevel);
                for(int i = 1; i<10; i++){
                    System.out.println(num+"x"+i+"="+num*i);
                }
            }
            System.out.println(messageFromServer);
        }
        socket.close();
    }
}

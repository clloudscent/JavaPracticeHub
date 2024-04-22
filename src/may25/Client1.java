package may25;

import javax.imageio.IIOException;
import java.io.*;
import java.lang.reflect.Array;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {
    public static void main(String[] args) throws IOException {
        int port = 9898;
        Socket socket = new Socket("localhost",port);

        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);
        Scanner sc = new Scanner(System.in);

        boolean runnable = true;
        int status = 0;
        while(runnable){
            String messageFromServer = bufferedReader.readLine();
            if(status==99){
                int num = Integer.parseInt(messageFromServer);
                for(int i = 1; i<10; i++){
                    System.out.println(num+"x"+i+"="+num*i);
                }
                status = 0;
            }
            if(messageFromServer.equals("exit")){
                break;
            }
            if(messageFromServer.equals("구구단")){
                status = 99;
            }
            System.out.println(messageFromServer);
        }
        socket.close();
    }
}

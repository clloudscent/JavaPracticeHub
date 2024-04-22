package tcpPracticeMay08;

import java.io.*;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Client_REF {
    public static void main(String[] args) throws IOException {
        //1. ID,pw 인증하기
        //2. 파일리스트 불러오기
        //3. 리스트에서 고른 파일을 서버로 보내기
        //4. 서버로부터 받아온 파일이름을 입력하고 서버로 보내기

        //1. ID,pw 인증하기
        int ip = 9898;
        Socket socket = new Socket("localhost", ip);
        Scanner sc = new Scanner(System.in);

        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);

        while (true) {
            String serverCode = bufferedReader.readLine();
            if (serverCode.equals("id")) {
                System.out.print("ID: ");
                printWriter.println(sc.nextLine());
                printWriter.flush();
            } else if (serverCode.equals("pw")) {
                System.out.print("비밀번호: ");
                printWriter.println(sc.nextLine());
                printWriter.flush();
            } else if (serverCode.equals("loggedIn")) {
                System.out.println("로그인 완료");
                break;
            }
        }

        //2. 파일리스트 불러오기
        String dirPath = "/Users/mac/filepractice";
        File dir = new File(dirPath);
        File[] files = dir.listFiles();

        Map<Integer, File> fileMap = new HashMap<>();
        int fileIndex = 0;

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    fileIndex++;
                    fileMap.put(fileIndex, file);
                    System.out.println(fileIndex + ":" + file.getName());
                }
            }

            if (bufferedReader.readLine().equals("needFilePath")) {
                System.out.print("파일번호: ");
                int fileNum = sc.nextInt();
                sc.nextLine();
                String filePathToServer = fileMap.get(fileNum).getPath();
                printWriter.println(filePathToServer);
                printWriter.flush();
            }

            if (bufferedReader.readLine().equals("needFileName")) {
                System.out.print("저장할 파일 이름: ");
                String fileName = sc.nextLine();
                printWriter.println(fileName);
                printWriter.flush();
            }

            printWriter.flush();
            System.out.println("저장할파일이름을 보냈습니다.");
        }
    }
}


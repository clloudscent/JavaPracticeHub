package tcpPracticeMay08;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String dirPath = "/Users/mac/filepractice";
        File dir = new File(dirPath);

        File[] files = dir.listFiles();
        int fileIndexCount = 0;
        Map<Integer, File> fileMap = new HashMap<>();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    fileIndexCount++;
                    fileMap.put(fileIndexCount, file);
                    System.out.println(fileIndexCount + ":" + file.getName());
                }
            }
            /*for (Integer i : fileMap.keySet()) {
                System.out.println(i + ":" + fileMap.get(i).getName());
            }*/
            System.out.print("파일번호: ");
            int fileNum = sc.nextInt();
            System.out.println(fileMap.get(fileNum).getPath());
        }


    }
}

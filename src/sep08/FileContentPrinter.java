package sep08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileContentPrinter {
    public static void main(String[] args) {
        String path = "파일 또는 폴더 경로 입력";
        File file = new File(path);

        if (file.exists()) {
            if (file.isFile()) {
                // 파일인 경우 파일 내용 출력
                printFileContent(file);
            } else if (file.isDirectory()) {
                // 폴더인 경우 폴더 내 파일 내용 출력
                printFolderContents(file);
            }
        } else {
            System.out.println("파일 또는 폴더를 찾을 수 없습니다.");
        }
    }

    public static void printFileContent(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            System.out.println("파일 내용:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("파일을 읽는 중 오류가 발생했습니다.");
        }
    }

    public static void printFolderContents(File folder) {
        File[] files = folder.listFiles();

        if (files != null) {
            System.out.println("폴더 내 파일 내용:");
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println("파일: " + file.getName());
                    printFileContent(file);
                    System.out.println();
                }
            }
        }
    }
}

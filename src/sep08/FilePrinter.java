package sep08;

import java.io.File;
import java.util.Scanner;

public class FilePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("파일 또는 폴더 경로를 입력하세요: ");
        String path = scanner.nextLine();

        File file = new File(path);

        if (file.exists()) {
            if (file.isFile()) {
                // 파일인 경우
                System.out.println("파일 내용:");
                try {
                    printFileContent(file);
                }catch(Exception e){
                    e.printStackTrace();
                }
            } else if (file.isDirectory()) {
                // 폴더인 경우
                System.out.println("폴더 내 파일 내용:");
                printFolderContents(file);
            }
        } else {
            System.out.println("파일 또는 폴더를 찾을 수 없습니다.");
        }

        scanner.close();
    }

    public static void printFileContent(File file) throws Exception {
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("파일을 읽는 중 오류가 발생했습니다.");
            throw e;
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    public static void printFolderContents(File folder) {
        File[] files = folder.listFiles();
        int errorCount = 0;
        if (files != null) {
            //폴더 a,b,c
            //a
            //a content //errorcount++
            for (File file : files) {
                if (file.isFile()) {
                    try{
                        System.out.println("파일: " + file.getName());
                        printFileContent(file);
                        System.out.println();
                    }catch (Exception e){
                        errorCount++;
                        System.out.println(errorCount);
                    }
                }
            }
        }
    }
}



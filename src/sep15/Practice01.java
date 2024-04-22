package sep15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int errorCount = 0;
        while(count<3){
            System.out.print("파일명: ");
            String className = sc.nextLine();
            count++;
            try {
                checkClass(className);
            }catch (Exception e){
                errorCount++;
            }
        }
        System.out.println(errorCount+ "번 로딩실패");
    }
    public static void checkClass(String className) throws Exception{
        Class.forName(className);
    }
}

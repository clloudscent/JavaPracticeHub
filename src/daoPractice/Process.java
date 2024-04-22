package daoPractice;

import java.util.Scanner;

public class Process{
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/practice";
        String id = "airplane";
        String pw = "airplane1234";
        Scanner sc = new Scanner(System.in);
        DAO dao  = new DAO(url, id, pw);
        DiaryVO diaryVO = new DiaryVO();

        System.out.println("id: ");
        String inputId = sc.nextLine();
        System.out.println("pw: ");
        String inputPw = sc.nextLine();

        if(!dao.login(inputId, inputPw)){
            System.out.println("로그인 실패");
            System.exit(0);
        }
        System.out.println("로그인 성골");

        boolean runnable = true;

        while(runnable){
            System.out.println("1. Create Diary");
            System.out.println("2. Read Diary");
            System.out.println("3. Update Diary");
            System.out.println("4. Delete Diary");
            System.out.println("5. Exit");
            System.out.println(">>");
            int inputProcessNum = sc.nextInt();
            sc.nextLine();

            switch (inputProcessNum){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }












        }
    }
}

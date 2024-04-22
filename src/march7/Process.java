package march7;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Process {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/practice";
        String id = "airplane";
        String pw = "airplane1234";
        Scanner sc = new Scanner(System.in);
        DAO dao = new DAO(url, id, pw);
        String today = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        System.out.print("아이디: ");
        String inputId = sc.nextLine();
        System.out.print("비밀번호: ");
        String inputPw = sc.nextLine();

        if (!dao.login(inputId, inputPw)) {
            System.out.println("로그인실패");
            System.exit(0);
        }
        System.out.println("로그인성공");


        boolean runnable = true;
        while (runnable) {
            System.out.println(
                    "1. create" +
                            " 2. read" +
                            " 3. update" +
                            " 4. delete" +
                            " 5. exit");

            System.out.print("번호입력: ");
            int inputNum = sc.nextInt();
            sc.nextLine();
            switch (inputNum) {
                case 1:
                    //create
                    System.out.println("====게시물작성====");
                    System.out.print("일기제목: ");
                    String title = sc.nextLine();
                    System.out.print("일기내용: ");
                    String content = sc.nextLine();

                    DiaryVO diaryVO1 = new DiaryVO(title, content, today, inputId);
                    dao.create(diaryVO1);
                    System.out.println("게시물이 작성되었습니다.");
                    break;

                case 2:
                    /*List<DiaryVO> readList = dao.read(inputId);
                    for (int i = 0; i < readList.size(); i++) {
                        System.out.print("ID: ");
                        System.out.println(readList.get(i).getId());
                        System.out.print("title: ");
                        System.out.println(readList.get(i).getTitle());
                        System.out.print("content: ");
                        System.out.println(readList.get(i).getContent());
                        System.out.println("createdDate: ");
                        System.out.println(readList.get(i).getCreatedDate());
                        System.out.println("updatedDate: ");
                        System.out.println(readList.get(i).getUpdatedDate());
                        System.out.println("writer: ");
                        System.out.println(readList.get(i).getWriter());
                        System.out.println("================================");
                    }*/
                    printDiaryList(dao, inputId);

                    break;

                case 3:
                    printDiaryList(dao, inputId);
                    System.out.println("====게시물수정====");
                    System.out.println("게시물ID: ");
                    String updateId = sc.nextLine();
                    System.out.print("일기제목: ");
                    String updateTitle = sc.nextLine();
                    System.out.print("일기내용: ");
                    String updateContent = sc.nextLine();
                    DiaryVO diaryVO3 = new DiaryVO();
                    diaryVO3.setId(updateId);
                    diaryVO3.setTitle(updateTitle);
                    diaryVO3.setContent(updateContent);
                    diaryVO3.setUpdatedDate(today);
                    dao.update(diaryVO3);
                    break;

//                DiaryVO diaryVO3 = new DiaryVO(updateId, updateTitle, updateContent, today);

                case 4:
                    printDiaryList(dao, inputId);
                    System.out.println("====게시물삭제====");
                    System.out.print("게시물ID: ");
                    String deleteId = sc.nextLine();
                    dao.delete(deleteId);
                    break;

                case 5:
                    System.out.println("시스템종료");
                    runnable = false;

            }
        }
    }

    public static void printDiaryList(DAO dao, String inputId) throws Exception {
        List<DiaryVO> readList = dao.read(inputId);
        for (int i = 0; i < readList.size(); i++) {
            System.out.print("ID: ");
            System.out.println(readList.get(i).getId());
            System.out.print("title: ");
            System.out.println(readList.get(i).getTitle());
            System.out.print("content: ");
            System.out.println(readList.get(i).getContent());
            System.out.println("createdDate: ");
            System.out.println(readList.get(i).getCreatedDate());
            System.out.println("updatedDate: ");
            System.out.println(readList.get(i).getUpdatedDate());
            System.out.println("writer: ");
            System.out.println(readList.get(i).getWriter());
            System.out.println("================================");
        }
    }
}

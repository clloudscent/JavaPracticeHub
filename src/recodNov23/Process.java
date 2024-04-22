package recodNov23;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Process {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/practice";
        String id = "airplane";
        String pw = "airplane1234";

        DAO dao = new DAO(url, id, pw);
        Scanner sc = new Scanner(System.in);

        System.out.println("id:");
        String inputId = sc.nextLine();
        System.out.println("pw: ");
        String password = sc.nextLine();

        if(!dao.login(inputId, password)){
            System.exit(0);
        }
        boolean runnable = true;

        while(runnable){
            System.out.println("1. Create");
            System.out.println("2. Read");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            int inputNum = sc.nextInt();
            sc.nextLine();

            switch (inputNum){
                case 1:
                    System.out.println("제목: ");
                    String title = sc.nextLine();
                    System.out.println("내용: ");
                    String content = sc.nextLine();
                    String today = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                    DiaryVO diaryVO1 = new DiaryVO(title, content, today, inputId);
                    dao.create(diaryVO1);
                    break;

                case 2:
                    List<DiaryVO> readList = dao.read(inputId);
                    for(int i =0; i<readList.size(); i++){
                        System.out.println("id: ");
                        System.out.println(readList.get(i).getId());
                        System.out.println("title: ");
                        System.out.println(readList.get(i).getTitle());
                        System.out.println("content: ");
                        System.out.println(readList.get(i).getContent());
                        System.out.println("createdDate: ");
                        System.out.println(readList.get(i).getUpdatedDate());
                        System.out.println("updatedDate: ");
                        System.out.println(readList.get(i).getUpdatedDate());
                        System.out.println("writer: ");
                        System.out.println(readList.get(i).getWriter());
                        System.out.println("=====");
                    }
                    break;


                case 3:
                    List<DiaryVO> readList3 = dao.read(inputId);
                    for(int i =0; i<readList3.size(); i++){
                        System.out.println("id: ");
                        System.out.println(readList3.get(i).getId());
                        System.out.println("title: ");
                        System.out.println(readList3.get(i).getTitle());
                        System.out.println("content: ");
                        System.out.println(readList3.get(i).getContent());
                        System.out.println("createdDate: ");
                        System.out.println(readList3.get(i).getUpdatedDate());
                        System.out.println("updatedDate: ");
                        System.out.println(readList3.get(i).getUpdatedDate());
                        System.out.println("writer: ");
                        System.out.println(readList3.get(i).getWriter());
                        System.out.println("=====");
                    }
                    System.out.println("updateId: ");
                    String updateInputId = sc.nextLine();
                    System.out.println("updateTitle: ");
                    String updateInputTitle = sc.nextLine();
                    System.out.println("updateContent: ");
                    String updatedInputContent = sc.nextLine();
                    String updateDate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));


                    DiaryVO diaryVO2 = new DiaryVO(updateInputId, updateInputTitle, updatedInputContent, updateDate);
                    dao.update(diaryVO2);
                    break;

                case 4:
                    List<DiaryVO> readList4 = dao.read(inputId);
                    for(int i =0; i<readList4.size(); i++){
                        System.out.println("id: ");
                        System.out.println(readList4.get(i).getId());
                        System.out.println("title: ");
                        System.out.println(readList4.get(i).getTitle());
                        System.out.println("content: ");
                        System.out.println(readList4.get(i).getContent());
                        System.out.println("createdDate: ");
                        System.out.println(readList4.get(i).getUpdatedDate());
                        System.out.println("updatedDate: ");
                        System.out.println(readList4.get(i).getUpdatedDate());
                        System.out.println("writer: ");
                        System.out.println(readList4.get(i).getWriter());
                        System.out.println("=====");
                    }
                    System.out.println("deleteInputId: ");
                    String deleteInputNum = sc.nextLine();
                    dao.delete(deleteInputNum);

                    break;

                case 5:
                    runnable = false;
                    break;
            }
        }
    }
}

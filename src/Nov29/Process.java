package Nov29;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Process {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String url =  "jdbc:mysql://localhost:3306/practice";
        String id = "airplane";
        String pw = "airplane1234";

        DAO dao = new DAO(url, id, pw);
        DiaryVO diaryVO = new DiaryVO();
        System.out.println("id: ");
        String inputId = sc.nextLine();
        System.out.println("pw: ");
        String inputPw = sc.nextLine();


        if(!dao.login(inputId, inputPw)){
            System.exit(0);
        }

        boolean runnable = true;

        while(runnable){
            System.out.println("1.Create");
            System.out.println("2.Read");
            System.out.println("3.Update");
            System.out.println("4.Delete");
            System.out.println("5.Exit");
            System.out.println(">>");
            int inputProcessNum = sc.nextInt();
            sc.nextLine();

            switch (inputProcessNum){
                case 1:
                    System.out.println("title: ");
                    String title = sc.nextLine();
                    System.out.println("content: ");
                    String content = sc.nextLine();
                    String today = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                    DiaryVO diaryVO1 = new DiaryVO(title, content, today, inputId);
                    dao.create(diaryVO1);


                case 2:
                    List<DiaryVO> readList = dao.read(inputId);

                    //read
                    for(int i = 0; i<readList.size(); i++){
                        System.out.println("id: ");
                        System.out.println(readList.get(i).getId());
                        System.out.println("title: ");
                        System.out.println(readList.get(i).getTitle());
                        System.out.println("content: ");
                        System.out.println(readList.get(i).getContent());
                        System.out.println("createdDate: ");
                        System.out.println(readList.get(i).getCreatedDate());
                        System.out.println("updatedDate: ");
                        System.out.println(readList.get(i).getUpdatedDate());
                        System.out.println("writer: ");
                        System.out.println(readList.get(i).getWriter());
                        System.out.println("=========================");
                    }
                    //readEnd
                    break;

                case 3:
                    List<DiaryVO> readList2 = new ArrayList<>();
                    //read
                    for(int i = 0; i<readList2.size(); i++){
                        System.out.println("id: ");
                        System.out.println(readList2.get(i).getId());
                        System.out.println("title: ");
                        System.out.println(readList2.get(i).getTitle());
                        System.out.println("content: ");
                        System.out.println(readList2.get(i).getContent());
                        System.out.println("createdDate: ");
                        System.out.println(readList2.get(i).getCreatedDate());
                        System.out.println("updatedDate: ");
                        System.out.println(readList2.get(i).getUpdatedDate());
                        System.out.println("writer: ");
                        System.out.println(readList2.get(i).getWriter());
                        System.out.println("=========================");
                    }
                    //readEnd

                    System.out.println("UpdateId: ");
                    String updateInputId = sc.nextLine();
                    System.out.println("title: ");
                    String updateTitle = sc.nextLine();
                    System.out.println("content: ");
                    String updateContent = sc.nextLine();

                    DiaryVO diaryVO2 = new DiaryVO(updateInputId, updateTitle, updateContent);
                    dao.update(diaryVO2);
                    break;

                case 4:
                    List<DiaryVO> readList3 = new ArrayList<>();
                    //read
                    for(int i = 0; i<readList3.size(); i++){
                        System.out.println("id: ");
                        System.out.println(readList3.get(i).getId());
                        System.out.println("title: ");
                        System.out.println(readList3.get(i).getTitle());
                        System.out.println("content: ");
                        System.out.println(readList3.get(i).getContent());
                        System.out.println("createdDate: ");
                        System.out.println(readList3.get(i).getCreatedDate());
                        System.out.println("updatedDate: ");
                        System.out.println(readList3.get(i).getUpdatedDate());
                        System.out.println("writer: ");
                        System.out.println(readList3.get(i).getWriter());
                        System.out.println("=========================");
                    }
                    //readEnd
                    System.out.println("deleteId: ");
                    String deleteId = sc.nextLine();

                    dao.delete(deleteId);
                    break;

                case 5:
                    runnable = false;
                    break;



            }

        }
    }
}

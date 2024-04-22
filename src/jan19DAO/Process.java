package jan19DAO;

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
        String today = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        DAO dao = new DAO(url, id, pw); //생성자를 통해 인스턴스화
        DiaryVO diaryVO = new DiaryVO();
        System.out.println("id: ");
        String inputId = sc.nextLine();
        System.out.println("pw: ");
        String inputPW = sc.nextLine();

        if (!dao.login(inputId, inputPW)) {
            System.out.println("로그인실패");
            System.exit(0);
        }
        System.out.println("로그인성공");
        boolean runnable = true;

        while (runnable) {
            System.out.println("1. Create Diary");
            System.out.println("2. Read Diary");
            System.out.println("3. Update Diary");
            System.out.println("4. Delete Diary");
            System.out.println("5. Exit");
            System.out.println(">>");
            int inputProcessNum = sc.nextInt();
            sc.nextLine();


            switch (inputProcessNum) {
                case 1:
                    System.out.println("일기쓰기");
                    System.out.println("제목: ");
                    String title = sc.nextLine();
                    System.out.println("내용: ");
                    String content = sc.nextLine();

                    DiaryVO diaryVO1 = new DiaryVO(title, content, today, inputId);
                    dao.create(diaryVO1);
                    break;

                case 2:
                    List<DiaryVO> readList = dao.read(inputId);
                    for (int i = 0; i < readList.size(); i++) {
                        System.out.println("id: ");
                        System.out.println(readList.get(i).getId());
                        System.out.println("title: ");
                        System.out.println(readList.get(i).getTitle());
                        System.out.println("content: ");
                        System.out.println(readList.get(i).getContent());
                        System.out.println("createdDate: ");
                        System.out.println(readList.get(i).getCreateDate());
                        System.out.println("updatedDate: ");
                        System.out.println(readList.get(i).getUpdatedDate());
                        System.out.println("writer: ");
                        System.out.println(readList.get(i).getWriter());
                        System.out.println("______________________");
                    }
                    break;

                case 3:
                    List<DiaryVO> readList3 = dao.read(inputId);

                    for (int i = 0; i < readList3.size(); i++) {
                        System.out.println("id: ");
                        System.out.println(readList3.get(i).getId());
                        System.out.println("title: ");
                        System.out.println(readList3.get(i).getTitle());
                        System.out.println("content: ");
                        System.out.println(readList3.get(i).getContent());
                        System.out.println("createdDate: ");
                        System.out.println(readList3.get(i).getCreateDate());
                        System.out.println("updatedDate: ");
                        System.out.println(readList3.get(i).getUpdatedDate());
                        System.out.println("writer: ");
                        System.out.println(readList3.get(i).getWriter());
                        System.out.println("______________________");
                    }

                    System.out.println("updateId: ");
                    String updateInputId = sc.nextLine();
                    System.out.println("title:");
                    String updateTitle = sc.nextLine();
                    System.out.println("content: ");
                    String updateContent = sc.nextLine();

                    DiaryVO diaryVO2 = new DiaryVO(updateInputId, updateTitle, updateContent);
                    String updatedDate = today;
                    diaryVO2.setUpdatedDate(today);
                    dao.update(diaryVO2);

                    break;

                case 4:
                    List<DiaryVO> readList4 = new ArrayList<>();

                    for (int i = 0; i < readList4.size(); i++) {
                        System.out.println("id: ");
                        System.out.println(readList4.get(i).getId());
                        System.out.println("title: ");
                        System.out.println(readList4.get(i).getTitle());
                        System.out.println("content: ");
                        System.out.println(readList4.get(i).getContent());
                        System.out.println("createdDate: ");
                        System.out.println(readList4.get(i).getCreateDate());
                        System.out.println("updatedDate: ");
                        System.out.println(readList4.get(i).getUpdatedDate());
                        System.out.println("writer: ");
                        System.out.println(readList4.get(i).getWriter());
                        System.out.println("______________________");
                    }
                    System.out.println("deleteId: ");
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

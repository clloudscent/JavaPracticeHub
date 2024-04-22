package RecordNov17;

import com.sun.security.jgss.GSSUtil;

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
        DAO dao = new DAO(url, id, pw);
        Scanner sc = new Scanner(System.in);
        System.out.println("아이디: ");
        String inputId = sc.nextLine();
        System.out.println("비밀번호: ");
        String inputPw = sc.nextLine();

        if (!dao.login(inputId, inputPw)) {
            System.out.println("로그인실패");
            System.exit(0);
        }

        System.out.println("로그인 성공");

        boolean runnable = true;

        while (runnable) {
            System.out.println("1. Create Diary");
            System.out.println("2. Read Diary");
            System.out.println("3. Update Diary");
            System.out.println("4. Delete Diary");
            System.out.println("5. Exit");
            System.out.println("번호: ");
            int inputNum = sc.nextInt();
            sc.nextLine();

            switch (inputNum) {
                case 1:
                    System.out.println("title: ");
                    String title = sc.nextLine();
                    System.out.println("content: ");
                    String content = sc.nextLine();
                    String today = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

                    DiaryVO diaryVO1 = new DiaryVO(title, content, today, today, inputId);
                    dao.create(diaryVO1);

                    break;
                case 2:
                    //read
                    List<DiaryVO> readList = dao.read(inputId);
                    for (int i = 0; i < readList.size(); i++) {
                        System.out.println("ID: ");
                        System.out.println(readList.get(i).getId());
                        System.out.println("Title: ");
                        System.out.println(readList.get(i).getTitle());
                        System.out.println("Content: ");
                        System.out.println(readList.get(i).getContent());
                        System.out.println("CreatedDate: ");
                        System.out.println(readList.get(i).getCreatedDate());
                        System.out.println("UpdatedDate: ");
                        System.out.println(readList.get(i).getUpdatedDate());
                        System.out.println("Writer: ");
                        System.out.println(readList.get(i).getWriter());
                        System.out.println("-----------------");
                    }
                    break;


                case 3:
                    List<DiaryVO> readList2 = dao.read(inputId);
                    for (int i = 0; i < readList2.size(); i++) {
                        System.out.println("ID: ");
                        System.out.println(readList2.get(i).getId());
                        System.out.println("Title: ");
                        System.out.println(readList2.get(i).getTitle());
                        System.out.println("Content: ");
                        System.out.println(readList2.get(i).getContent());
                        System.out.println("CreatedDate: ");
                        System.out.println(readList2.get(i).getCreatedDate());
                        System.out.println("UpdatedDate: ");
                        System.out.println(readList2.get(i).getUpdatedDate());
                        System.out.println("Writer: ");
                        System.out.println(readList2.get(i).getWriter());
                        System.out.println("-----------------");
                    }

                    System.out.println("updateId : ");
                    String updateInputId = sc.nextLine();
                    System.out.println("title: ");
                    String updateTitle = sc.nextLine();
                    System.out.println("content: ");
                    String updateContent = sc.nextLine();
                    String updateDate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

                    DiaryVO diaryVO2 = new DiaryVO(updateTitle, updateContent, updateDate, updateInputId);
                    dao.update(diaryVO2);
                    break;


                case 4:
                    List<DiaryVO> readList3 = dao.read(inputId);
                    for (int i = 0; i < readList3.size(); i++) {
                        System.out.println("ID: ");
                        System.out.println(readList3.get(i).getId());
                        System.out.println("Title: ");
                        System.out.println(readList3.get(i).getTitle());
                        System.out.println("Content: ");
                        System.out.println(readList3.get(i).getContent());
                        System.out.println("CreatedDate: ");
                        System.out.println(readList3.get(i).getCreatedDate());
                        System.out.println("UpdatedDate: ");
                        System.out.println(readList3.get(i).getUpdatedDate());
                        System.out.println("Writer: ");
                        System.out.println(readList3.get(i).getWriter());
                        System.out.println("-----------------");
                    }

                    System.out.println("deleteId: ");
                    String deleteId = sc.nextLine();
                    dao.delete(deleteId);
                    break;

                case 5:
                    runnable = false;
                    break;
                case 6:
                    /*List<DiaryVO> diaryList = dao.read(inputId);
                    DiaryVO longestDiary = dao.findLongestDiaryVO(diaryList);
                    System.out.println(longestDiary);
                    System.out.println("ID: ");
                    System.out.println(longestDiary.getId());
                    System.out.println("Title: ");
                    System.out.println(longestDiary.getTitle());
                    System.out.println("Content: ");
                    System.out.println(longestDiary.getContent());
                    System.out.println("CreatedDate: ");
                    System.out.println(longestDiary.getCreatedDate());
                    System.out.println("UpdatedDate: ");
                    System.out.println(longestDiary.getUpdatedDate());
                    System.out.println("Writer: ");
                    System.out.println(longestDiary.getWriter());
                    System.out.println("-----------------");*/
                    List<DiaryVO> diaryVOList = dao.read(inputId);
                    System.out.println(diaryVOList.size());
                    System.out.println("날짜를 입력해주세요 : ");
                    String inputDate = sc.nextLine();
                    DiaryVO diaryWithDate = dao.diaryWithInputDate(diaryVOList, inputDate);


                    System.out.println(inputDate + "에 입력한 일기");
                    System.out.println("ID: " + diaryWithDate.getId());
                    System.out.println("TITLE: " + diaryWithDate.getTitle());
                    System.out.println("CONTENT: " + diaryWithDate.getContent());
                    System.out.println("CreatedDate: " + diaryWithDate.getCreatedDate());
                    System.out.println("UpdatedDate: " + diaryWithDate.getUpdatedDate());
                case 7:
                    List<DiaryVO> diaryList = dao.readAllDiary();
//                    String bestUser = dao.userTop(diaryList);
                    String bestUser = dao.writerTop(diaryList);
                    System.out.println(bestUser);

                case 8:
                    List<DiaryVO> diaryVOList1 = dao.readAllDiary();
                    String winner = dao.findTopUser(diaryVOList1);
                    System.out.println(winner);


            }
        }
    }

}

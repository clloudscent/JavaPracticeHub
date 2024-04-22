package Record;

import java.sql.SQLException;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Process {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3306/practice";
        String id = "airplane";
        String pw = "airplane1234";

        DAO dao = new DAO(url, id, pw);
        DiaryVO diaryVO = new DiaryVO();
        String today = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        System.out.println("로그인화면");
        System.out.print("아이디: ");
        String inputId = sc.nextLine();
        System.out.print("비밀번호: ");
        String inputPw = sc.nextLine();
        if(!dao.login(inputId, inputPw)){
            System.out.println("로그인 실패");
            System.exit(0);
        }
        System.out.println("로그인성공");

        boolean runnable = true;

        while(runnable){
            System.out.println("수행할 프로세스 선택");
            System.out.println("1. Create Diary");
            System.out.println("2. Read Diary");
            System.out.println("3. Update Diary");
            System.out.println("4. Delete Diary");
            System.out.println("5. Exit");
            System.out.print(">>:");
            int inputProcessNum = sc.nextInt();
            sc.nextLine();

            switch (inputProcessNum){
                case 1:
                    System.out.println("일기쓰기");
                    System.out.print("제목: ");
                    String title = sc.nextLine();
                    System.out.println("내용: ");
                    String content = sc.nextLine();


                    DiaryVO diaryVO1 = new DiaryVO(title, content, today, inputId);
                    dao.create(diaryVO1);
                    System.out.println("게시물이 작성되었습니다!");
                    System.out.println(" ");
                    break;
                case 2:
                    List<DiaryVO> readList = dao.read(inputId);
                    for(int i =0; i<readList.size(); i++){
                        System.out.print("ID: ");
                        System.out.println(readList.get(i).getId());
                        System.out.print("제목: ");
                        System.out.println(readList.get(i).getTitle());
                        System.out.print("내용: ");
                        System.out.println(readList.get(i).getContent());
                        System.out.print("작성일: ");
                        System.out.println(readList.get(i).getCreatedDate());
                        System.out.print("수정일: ");
                        System.out.println(readList.get(i).getUpdatedDate());
                        System.out.print("작성자: ");
                        System.out.println(readList.get(i).getWriter());
                        System.out.println("===========================");
                    }
                    break;
                case 3:
                    System.out.println("수정하기");
                    //read
                    List<DiaryVO> readCase3 = dao.read(inputId);
                    for(int i =0; i<readCase3.size(); i++){
                        System.out.print("ID: ");
                        System.out.println(readCase3.get(i).getId());
                        System.out.print("제목: ");
                        System.out.println(readCase3.get(i).getTitle());
                        System.out.print("내용: ");
                        System.out.println(readCase3.get(i).getContent());
                        System.out.print("작성일: ");
                        System.out.println(readCase3.get(i).getCreatedDate());
                        System.out.print("수정일: ");
                        System.out.println(readCase3.get(i).getUpdatedDate());
                        System.out.print("작성자: ");
                        System.out.println(readCase3.get(i).getWriter());
                        System.out.println("===========================");
                    }
                    //read End
                    System.out.print("수정할 게시물 ID: ");
                    String updateInputId = sc.nextLine();
                    System.out.print("제목: ");
                    String updateTitle = sc.nextLine();
                    System.out.print("내용: ");
                    String updateContent = sc.nextLine();

                    DiaryVO diaryVO2 = new DiaryVO(updateInputId, updateTitle, updateContent);
                    dao.update(diaryVO2);
                    System.out.println("수정되었습니다");
                    break;
                case 4:
                    //read
                    List<DiaryVO> readCase4 = dao.read(inputId);
                    for(int i =0; i<readCase4.size(); i++){
                        System.out.print("ID: ");
                        System.out.println(readCase4.get(i).getId());
                        System.out.print("제목: ");
                        System.out.println(readCase4.get(i).getTitle());
                        System.out.print("내용: ");
                        System.out.println(readCase4.get(i).getContent());
                        System.out.print("작성일: ");
                        System.out.println(readCase4.get(i).getCreatedDate());
                        System.out.print("수정일: ");
                        System.out.println(readCase4.get(i).getUpdatedDate());
                        System.out.print("작성자: ");
                        System.out.println(readCase4.get(i).getWriter());
                        System.out.println("===========================");
                    }
                    //read End
                    System.out.print("삭제할 게시물 ID: ");
                    String deleteInputNum = sc.nextLine();
                    dao.delete(deleteInputNum);
                    System.out.println("삭제가 완료되었습니다.");
                    break;
                case 5:
                    System.out.println("시스템을 종료합니다.");
                    runnable = false;
                    break;
            }
        }



    }
}

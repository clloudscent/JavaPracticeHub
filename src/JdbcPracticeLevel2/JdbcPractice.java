package JdbcPracticeLevel2;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JdbcPractice {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String url ="jdbc:mysql://localhost:3306/practice";
        String id ="airplane";
        String pw = "airplane1234";

        DAO dao = new DAO(url, id, pw);

        //로그인
        String username = sc.nextLine();
        String password = sc.nextLine();

        if(!dao.logIn(username, password)){
            System.out.println("로그인 실패");
            System.exit(0);
        }

        System.out.println("로그인성공");

            System.out.println("번호를 입력해주세요");
            System.out.println("1. 일기쓰기");
            System.out.println("2. 일기조회");
            System.out.println("3. 일기수정");
            System.out.println("4. 일기삭제");
            System.out.println("5. 시스템종료");
            System.out.print("번호입력: ");

            int inputNum = sc.nextInt();
            sc.nextLine();
            boolean runnable = true;

                switch (inputNum) {
                    case 1:
                    System.out.println("일기쓰기");
                    System.out.print("제목: ");
                    String inputTitle = sc.nextLine();
                    System.out.print("내용: ");
                    String inputContent = sc.nextLine();
                    String today = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                    DiaryVO diaryVO = new DiaryVO(inputTitle, inputContent, today, today, username);
                    //diaryVO.setTitle(inputTitle);
                    //diaryVO.setContent(inputContent);
                    dao.createDiary(diaryVO);
                    System.out.println("일기가 작성되었습니다!");
                    break;
                case 2:
                    List<DiaryVO> diaryList = dao.readDiary(username);
                    System.out.println(diaryList.size());
                    for (int i = 0; i < diaryList.size(); i++) {
                        System.out.print("ID: ");
                        System.out.println(diaryList.get(i).getId());
                        System.out.print("제목: ");
                        System.out.println(diaryList.get(i).getTitle());
                        System.out.print("내용: ");
                        System.out.println(diaryList.get(i).getContent());
                        System.out.print("작성일: ");
                        System.out.println(diaryList.get(i).getCreatedDate());
                        System.out.print("수정일: ");
                        System.out.println(diaryList.get(i).getUpdatedDate());
                        System.out.print("작성자: ");
                        System.out.println(diaryList.get(i).getWriter());
                        System.out.println("===============================");
                    }
                    System.out.println("일기조회완료!");
                    break;
                case 3:
                    dao.readDiary(username);
                    System.out.print("수정할 게시물 아이디: ");
                    String updateInputNum = sc.nextLine();
                    System.out.print("제목: ");
                    String updateTitle = sc.nextLine();
                    System.out.print("내용: ");
                    String updateContent = sc.nextLine();
                    String updateDate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                    DiaryVO diaryVO1 = new DiaryVO(updateInputNum, updateTitle, updateContent, updateDate);
                    dao.updateDiary(diaryVO1);
                    break;
                case 4:
                    dao.readDiary(username);
                    System.out.print("삭제할 게시물 아이디: ");
                    String deleteInputNum =  sc.nextLine();
                   DiaryVO diaryVO2 = new DiaryVO(deleteInputNum);
                   dao.deleteDiary(String.valueOf(diaryVO2));
                    break;
                case 5:
                    System.out.println("종료합니다.");
                    runnable = false;
                    break;
                    case 6:
                        System.out.println("가장 긴 일기: ");

                        List<DiaryVO> diaryTextList = dao.readDiary(username);
                        System.out.println(diaryTextList.size());
                        int longestText = 0;
                        String longestTextId = "";
                        for(int i=0; i<diaryTextList.size(); i++){
                            if(longestText<diaryTextList.get(i).getContent().length()){
                                longestText = diaryTextList.get(i).getContent().length();
                                longestTextId = diaryTextList.get(i).getId();
                            }
                        }
                        System.out.println("가장 긴 글자수를 가진 ID: "+longestTextId);
                        System.out.println("글자 수: " + longestText);
                        break;
            }
        }


    }


/*
package jan06DAOPractice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Process {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String url  = "jdbc:mysql://localhost:3306/practice";
        String id = "airplane";
        String pw = "airplane1234";
        String today = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));


        DAO dao = new DAO(url, id, pw); //db에 접근하기위해, DriverManager.getConnection메소드의 매개변수 url,id,pw를 넣기위한 과정. 이것을 DAO로 따로 빼준이유가 궁금합니다. DAO의 역할을 정확하게 이해하지 못했습니다.

        System.out.println("로그인");
        System.out.print("ID ");
        String inputId = sc.nextLine();
        System.out.print("PW: ");
        String inputPw = sc.nextLine();

        if(!dao.login(inputId,inputPw)){
            System.out.println("회원정보가 잘못 입력되었습니다.");
            System.exit(0);
        }
        System.out.println(inputId+"님 안녕하세요!");

        boolean runnable = true;

        while(runnable){
            System.out.println("1. 일기쓰기");
            System.out.println("2. 일기조회");
            System.out.println("3. 일기수정");
            System.out.println("4. 일기삭제");
            System.out.println("5. 프로그램 종료");
            System.out.println("번호>>");
            int inputNumber = sc.nextInt();
            sc.nextLine();


            switch (inputNumber){

                case 1:
                    System.out.println("<<<<<일기쓰기>>>>>");
                    System.out.print("제목: ");
                    String title = sc.nextLine();
                    System.out.print("내용: ");
                    String content = sc.nextLine();

                    DiaryVO diaryVO1 = new DiaryVO(title, content, today, inputId);
                    dao.create(diaryVO1);
                    System.out.println("게시물이 작성되었습니다.");
                    break;

                case 2:
                    List<DiaryVO> readList = dao.read(inputId);
                    for(int i =0; i<readList.size(); i++){
                        System.out.print("ID: ");
                        System.out.println(readList.get(i).getId());
                        System.out.print("제목:  ");
                        System.out.println(readList.get(i).getTitle());
                        System.out.print("내용: ");
                        System.out.println(readList.get(i).getContent());
                        System.out.print("작성일: ");
                        System.out.println(readList.get(i).getCreatedDate());
                        System.out.print("수정일: ");
                        System.out.println(readList.get(i).getUpdatedDate());
                        System.out.print("작성자: ");
                        System.out.println(readList.get(i).getWriter());
                        System.out.println("_______________________________");
                    }
                    break;


                case 3:
                    System.out.println("<<<<<게시물 목록 불러오기>>>>>");
                    List<DiaryVO> readList3 = dao.read(inputId);
                    for(int i =0; i<readList3.size(); i++){
                        System.out.print("ID: ");
                        System.out.print(readList3.get(i).getId());
                        System.out.print(")제목:  ");
                        System.out.print(readList3.get(i).getTitle());
                        System.out.print("____내용: ");
                        System.out.print(readList3.get(i).getContent());
                        System.out.println(" ");
                    }
                    System.out.println("<<<<<수정할 게시물 ID를 입력해주세요>>>>>");
                    System.out.print("ID: ");
                    String updateInputId = sc.nextLine();
                    System.out.println("<<<<<수정하기>>>>>");
                    System.out.println("<<<<<"+updateInputId+"번 게시물 수정하기>>>>>");
                    System.out.print("제목:");
                    String updateTitle = sc.nextLine();
                    System.out.print("내용:");
                    String updateContent = sc.nextLine();


                    DiaryVO diaryVO3 = new DiaryVO(updateInputId, updateTitle, updateContent);

                    String updatedDate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                    diaryVO3.setUpdatedDate(updatedDate);
                    dao.update(diaryVO3);
                    System.out.println("수정완료!");
                    break;

                case 4:
                    System.out.println("<<<<<게시물 목록 불러오기>>>>>");
                    List<DiaryVO> readList4 = dao.read(inputId);
                    for(int i =0; i<readList4.size(); i++){
                        System.out.print("ID: ");
                        System.out.print(readList4.get(i).getId());
                        System.out.print(")제목:  ");
                        System.out.print(readList4.get(i).getTitle());
                        System.out.print("____내용: ");
                        System.out.print(readList4.get(i).getContent());
                        System.out.println(" ");
                    }
                    System.out.println("<<<<<삭제할 게시물 ID를 입력해주세요>>>>>");
                    System.out.print("ID: ");
                    String deleteInputId = sc.nextLine();
                    dao.delete(deleteInputId);
                    System.out.println("삭제완료!");
                    break;

                case 5:
                    System.out.println("<<<<<시스템 종료>>>>>");
                    runnable = false;
                    break;

                case 6:


            }
        }
    }
}
*/

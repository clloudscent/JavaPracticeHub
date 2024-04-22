package Dec21;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Process {
    public static void main(String[] args) throws Exception {
        String url  = "jdbc:mysql://localhost:3306/practice";
        String id = "airplane";
        String pw = "airplane1234";

        DAO dao =  new DAO(url, id, pw);
        DiaryVO diaryVO = new DiaryVO();
        DiaryProcessor dp = new DiaryProcessor();
        List<DiaryVO> diaryVOList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("id: ");
        String inputId = sc.nextLine();
        System.out.println("pw: ");
        String inputPw = sc.nextLine();


        if(!dao.login(inputId, inputPw)){
            System.exit(0);
        }

        boolean runnable  =true;

        while(runnable){
            System.out.println("1.create");
            System.out.println("2.read");
            System.out.println("3.update");
            System.out.println("4.delete");
            System.out.println("5.exit");
            System.out.println(">>");
            int inputNum = sc.nextInt();
            sc.nextLine();
            switch (inputNum){
                case 1:
                    System.out.println("title: ");
                    String title = sc.nextLine();
                    System.out.println("content: ");
                    String content = sc.nextLine();
                    String today = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                    DiaryVO diaryVO1 = new DiaryVO(title, content, today, inputId);
                    dao.create(diaryVO1);
                    break;

                case 2:
                    List<DiaryVO> readList = dao.read(inputId);
                    //enhanced for loop 사용 가능한가요?
                    /*for(int i =0; i<readList.size(); i++){
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
                        System.out.println("________________________");
                    }*/

                    for(DiaryVO currentDiaryVO : readList){
                        System.out.print("id: ");
                        System.out.println(currentDiaryVO.getId());
                        System.out.print("title: ");
                        System.out.println(currentDiaryVO.getTitle());
                        System.out.print("content");
                        System.out.println(currentDiaryVO.getContent());
                        System.out.print("createdDate: ");
                        System.out.println(currentDiaryVO.getCreatedDate());
                        System.out.print("updatedDate: ");
                        System.out.println(currentDiaryVO.getUpdatedDate());
                        System.out.print("writer: ");
                        System.out.println(currentDiaryVO.getWriter());
                        System.out.println("___________________");
                    }
                    break;


                case 3:
                    //UPDATE
                    List<DiaryVO> readList2 = new ArrayList<>();
                    for(int i =0; i<readList2.size(); i++){
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
                        System.out.println("________________________");
                    }
                    System.out.println("updateId :");
                    String updateInputId = sc.nextLine();
                    System.out.println("title: ");
                    String updateTitle = sc.nextLine();
                    System.out.println("content: ");
                    String updateContent = sc.nextLine();
                    //String  = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));


                    DiaryVO diaryVO2 = new DiaryVO(updateInputId, updateTitle, updateContent);
                    dao.update(diaryVO2);
                    break;

                case 4:
                    List<DiaryVO> readList3 = new ArrayList<>();
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
                        System.out.println("________________________");
                    }
                    System.out.println("deleteId :");
                    String deleteId = sc.nextLine();

                    dao.delete(deleteId);
                    break;

                case 5:
                    runnable = false;
                    break;

                case 6:
                    //System.out.println(dp.extract(dao.selectAll()));
                    System.out.println(dp.extractWithMap(dao.selectAll()));
                    break;

            }
        }
    }
}

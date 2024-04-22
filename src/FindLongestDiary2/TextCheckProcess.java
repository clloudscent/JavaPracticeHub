package FindLongestDiary2;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class TextCheckProcess {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/practice";
        String id = "airplane";
        String pw = "airplane1234";

        DAO dao = new DAO(url, id, pw);

        Scanner sc = new Scanner(System.in);
        System.out.println("아이디: ");
        String username = sc.nextLine();
        System.out.println("비밀번호: ");
        String password=  sc.nextLine();

        if(!dao.login(username, password)){
            System.out.println("로그인실패");
            System.exit(0);
        }

        System.out.println(username+"님 안녕하세요!");
        System.out.println(username+ "님의 일기 목록");
        int longestText = 0;
        int textTopId = 0;
        List<DiaryVO> readList = dao.reload(username);
        //List<.DiaryVO> readList = dao.reload(username);

        for(int i =0; i<readList.size(); i++){
            System.out.print("ID: ");
            System.out.println(readList.get(i).getId());
            System.out.print("Content: ");
            System.out.println(readList.get(i).getContent());
            System.out.print("Writer: ");
            System.out.println(readList.get(i).getWriter());
            System.out.print("글자 수: ");
            System.out.println(readList.get(i).getContent().length());
            if(longestText<readList.get(i).getContent().length()){
                longestText = readList.get(i).getContent().length();
                textTopId = Integer.parseInt(readList.get(i).getId());
            }
            System.out.println("-----------------");
        }
        System.out.println(textTopId);
        System.out.println(longestText);
        System.out.println("글자수가 가장 많은 글: ");
        System.out.print("ID: ");

        System.out.println(readList.get(textTopId-2).getId());
        System.out.print("Content: ");
        System.out.println(readList.get(textTopId-2).getContent());
        System.out.print("Title: ");
        System.out.println(readList.get(textTopId-2).getTitle());
        System.out.print("작성일: ");
        System.out.println(readList.get(textTopId-2).getCreatedDate());
        System.out.print("수정일: ");
        System.out.println(readList.get(textTopId-2).getUpdatedDate());
        System.out.print("작성자: ");
        System.out.println(readList.get(textTopId-2).getWriter());
        System.out.print("글자수: ");
        System.out.println(readList.get(textTopId-2).getContent().length());
    }
}

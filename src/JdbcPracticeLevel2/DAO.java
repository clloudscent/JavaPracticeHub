package JdbcPracticeLevel2;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class DAO {
    Connection conn;



    //Connection 메소드

    public DAO(String url, String id, String pw) throws Exception{
        conn = DriverManager.getConnection(url, id, pw);
    }



    //로그인
    public boolean logIn(String inputId, String inputPw) throws Exception{
        String sql = "select * from user where user_id = ? AND user_pw = ?";

        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, inputId);
        pstmt.setString(2, inputPw);
        ResultSet rs = pstmt.executeQuery();

        if(rs.next()){
            return true;
        }else{
            return false;
        }
    }

    //CRUD
    //Create
    public void createDiary(DiaryVO diaryVO) throws Exception{
        String sql = "insert into diary(id, title, content, created_date, updated_date, user_id) values (?,?,?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setString(1, diaryVO.getId());
        pstmt.setString(2, diaryVO.getTitle());
        pstmt.setString(3, diaryVO.getContent());
        String today = LocalDate.now().format((DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        pstmt.setString(4, today);
        pstmt.setString(5, today);
        pstmt.setString(6, diaryVO.getWriter());
        pstmt.execute();
    }


    //Update
    public void updateDiary(DiaryVO diaryVO) throws Exception{
        String sql = "update diary set title=?, content=?, updated_date=? where id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, diaryVO.getTitle());
        pstmt.setString(2, diaryVO.getContent());
        String today = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        pstmt.setString(3, today);
        pstmt.setString(4, diaryVO.getId());
        pstmt.execute();
    }


    //Read
    public List<DiaryVO> readDiary(String inputId) throws Exception{
        List<DiaryVO> diaryVOList = new ArrayList<>();
        String sql = "select * from diary where id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, inputId);
        ResultSet rs = pstmt.executeQuery();
        while(rs.next()){
            String id = rs.getString("id");
            String title = rs.getString("title");
            String content = rs.getString("content");
            String createdDate = rs.getString("created_date");
            String updatedDate = rs.getString("updated_date");
            String writer = rs.getString("user_id");
            DiaryVO diaryVO = new DiaryVO(id, title, content, createdDate, updatedDate, writer);
            diaryVOList.add(diaryVO);
        }
        return diaryVOList;
    }


    //Delete
    public void deleteDiary(String inputId) throws Exception{
        String sql = "delete from diary where id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, inputId);
        pstmt.execute();
    }

}


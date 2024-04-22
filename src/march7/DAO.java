package march7;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAO {
    Connection conn;

    public DAO(String url, String id, String pw) throws SQLException {
        conn = DriverManager.getConnection(url, id, pw);
    }

    //log-in
    public boolean login(String inputId, String inputPw) throws SQLException {
        String sql = "select * from user where user_id = ? AND user_pw = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, inputId);
        pstmt.setString(2, inputPw);

        ResultSet rs = pstmt.executeQuery();
        if(rs.next()){
            return true;
        }else {
            return false;
        }
    }

    public void create(DiaryVO diaryVO) throws SQLException {
        String sql ="insert into diary (id, title, content, created_date, updated_date, user_id) values (?,?,?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, diaryVO.getId());
        pstmt.setString(2, diaryVO.getTitle());
        pstmt.setString(3, diaryVO.getContent());
        pstmt.setString(4, diaryVO.getCreatedDate());
        pstmt.setString(5, diaryVO.getUpdatedDate());
        pstmt.setString(6, diaryVO.getWriter());
        pstmt.execute();
    }

    public void update(DiaryVO diaryVO)throws SQLException{
        String sql = "update diary set title = ?, content = ?, updated_date = ? where id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, diaryVO.getTitle());
        pstmt.setString(2, diaryVO.getContent());
        pstmt.setString(3, diaryVO.getUpdatedDate());
        pstmt.setString(4, diaryVO.getId());
        pstmt.execute();
    }

    public void delete(String deleteId) throws SQLException{
        String sql = "delete from diary where id = ? ";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, deleteId);
        pstmt.execute();
    }

    //read
    public List<DiaryVO> read(String username) throws SQLException{
        String sql = "select * from diary where user_id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, username);
        ResultSet rs = pstmt.executeQuery();
        List<DiaryVO> diaryVOList  = new ArrayList<>();

        while(rs.next()){
            DiaryVO diaryVOForRead = new DiaryVO();
            String id = rs.getString("id");
            String title = rs.getString("title");
            String content = rs.getString("content");
            String createdDate = rs.getString("created_date");
            String updatedDate=  rs.getString("updated_date");
            String writer = rs.getString("user_id");


            diaryVOForRead.setId(id);
            diaryVOForRead.setTitle(title);
            diaryVOForRead.setContent(content);
            diaryVOForRead.setCreatedDate(createdDate);
            diaryVOForRead.setUpdatedDate(updatedDate);
            diaryVOForRead.setWriter(writer);
            diaryVOList.add(diaryVOForRead);
        }
    return diaryVOList;
    }



}

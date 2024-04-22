package feb15Dao;

import java.sql.*;
import java.util.List;

public class DAO {
    Connection conn;

    public DAO(){

    }

    public DAO(String url, String id, String pw) throws SQLException {
        conn = DriverManager.getConnection(url, id, pw);
    }

    public boolean login(String inputId, String inputPw) throws SQLException {
        String sql = "select * from user where user_id = ? AND user_pw = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, inputId);
        pstmt.setString(2, inputPw);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()){
            return true;
        }else{
            return false;
        }
    }

    //create

    public void create(DiaryVO diaryVO) throws SQLException{
        String sql = "insert (id, title, content, created_date, updated_date, user_id) into diary values(?,?,?,?,?,?) ";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, diaryVO.getId());
        pstmt.setString(2, diaryVO.getTitle());
        pstmt.setString(3, diaryVO.getContent());
        pstmt.setString(4, diaryVO.getCreatedDate());
        pstmt.setString(5, diaryVO.getUpdatedDate());
        pstmt.setString(6, diaryVO.getUserId());
        pstmt.execute();
    }
    //데이터를 입력받고 쿼리문만 데이터베이스로 날리면 되므로 리턴값이 void


    //read



    //update

    //delete
}

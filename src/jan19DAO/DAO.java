package jan19DAO;

import java.awt.geom.RectangularShape;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAO {
    Connection conn;

    public DAO(String url, String id, String pw) throws Exception{
        conn = DriverManager.getConnection(url, id, pw);
    }

    public boolean login(String inputId, String inputPw) throws Exception{
        String sql  = "select * from user where user_id = ? AND user_pw = ?";
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

    public List<DiaryVO> read(String userId) throws Exception{
        List<DiaryVO> diaryList = new ArrayList<>();
        String sql = "select * from diary where user_id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, userId);

        ResultSet rs = pstmt.executeQuery();

        while(rs.next()){
            String id = rs.getString("id");
            String title = rs.getString("title");
            String content = rs.getString("content");
            String createdDate = rs.getString("created_date");
            String updatedDate = rs.getString("updated_date");
            String writer = rs.getString("user_id");

            DiaryVO diaryVO = new DiaryVO(id, title, content, createdDate, updatedDate, writer);
            diaryList.add(diaryVO);
        }
        return diaryList;
    }

    public void create(DiaryVO diaryVO) throws Exception{
        String sql = "insert into diary(id, title, content, created_date, updated_date, user_id) values (?,?,?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, diaryVO.getId());
        pstmt.setString(2,diaryVO.getTitle());
        pstmt.setString(3, diaryVO.getContent());
        pstmt.setString(4, diaryVO.getCreateDate());
        pstmt.setString(5, diaryVO.getUpdatedDate());
        pstmt.setString(6, diaryVO.getWriter());
        pstmt.execute();
    }

    public void update(DiaryVO diaryVO) throws Exception{
        String sql = "update diary set title = ?, content = ?, updated_date = ? where id =?";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        pstmt.setString(1, diaryVO.getTitle());
        pstmt.setString(2, diaryVO.getContent());
        pstmt.setString(3, diaryVO.getUpdatedDate());
        pstmt.setString(4, diaryVO.getId());
        pstmt.execute();
    }

    public void delete(String deleteId) throws Exception{
        String sql = "delete from diary where id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, deleteId);
        pstmt.execute();
    }




}

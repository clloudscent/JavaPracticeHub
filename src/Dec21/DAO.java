package Dec21;

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

    public DAO(String url, String id, String pw) throws Exception{
        conn = DriverManager.getConnection(url, id, pw);
    }

    public boolean login(String inputId, String inputPw) throws Exception{
        String sql = "select * from user where user_id =? AND user_pw = ?";
        PreparedStatement loginPstmt = conn.prepareStatement(sql);
        loginPstmt.setString(1, inputId);
        loginPstmt.setString(2, inputPw);

        ResultSet loginRs = loginPstmt.executeQuery();
        if(loginRs.next()){
            return true;
        }else{
            return false;
        }
    }

    public void create(DiaryVO diaryVO)throws Exception{
        String createSql = "insert into diary(title, content, created_date, updated_date, user_id) values(?,?,?,?,?)";
        PreparedStatement createPstmt = conn.prepareStatement(createSql);
        createPstmt.setString(1, diaryVO.getTitle());
        createPstmt.setString(2, diaryVO.getContent());
        createPstmt.setString(3, diaryVO.getCreatedDate());
        createPstmt.setString(4, diaryVO.getUpdatedDate());
        createPstmt.setString(5, diaryVO.getWriter());
        createPstmt.execute();
    }

    public List<DiaryVO> read(String userId) throws Exception{
        List<DiaryVO> diaryVOList = new ArrayList<>();
        String readSql = "select * from diary where user_id = ?";
        PreparedStatement readPstmt = conn.prepareStatement(readSql);
        readPstmt.setString(1, userId);

        ResultSet readRs = readPstmt.executeQuery();

        while(readRs.next()){
            String id = readRs.getString("id");
            String title = readRs.getString("title");
            String content = readRs.getString("content");
            String createdDate = readRs.getString("created_date");
            String updatedDate = readRs.getString("updated_date");
            String writer= readRs.getString("user_id");

            DiaryVO diaryVO = new DiaryVO(id, title,content, createdDate, updatedDate,writer);
            diaryVOList.add(diaryVO);
        }
        return diaryVOList;
    }

    public void update(DiaryVO diaryVO) throws Exception{
        String updateSql = "update diary set title = ?, content = ?, updated_date =? where id = ?";
        PreparedStatement updatePstmt = conn.prepareStatement(updateSql);
        updatePstmt.setString(1, diaryVO.getTitle());
        updatePstmt.setString(2, diaryVO.getContent());
        String updateDate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        updatePstmt.setString(3, updateDate);
        updatePstmt.setString(4, diaryVO.getId());
        updatePstmt.execute();
    }

    public void delete(String deleteId) throws Exception{
        String deleteSql = "delete from diary where id = ?";
        PreparedStatement deletePstmt = conn.prepareStatement(deleteSql);
        deletePstmt.setString(1, deleteId);
        deletePstmt.execute();
    }

    public List<DiaryVO> selectAll() throws Exception{
        List<DiaryVO> diaryVOList = new ArrayList<>();
        String showSql = "select * from diary";
        PreparedStatement showPstmt = conn.prepareStatement(showSql);
        ResultSet rs = showPstmt.executeQuery();
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
}

package Record;

import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class DAO {
    Connection conn;


    //생성자
    public DAO(String url, String id, String pw) throws SQLException {
        conn = DriverManager.getConnection(url, id, pw);
        //conn 인스턴스를 만들어낸다.
    }

    //로그인부분
    public boolean login(String inputId, String inputPw) throws SQLException {
        String sql = "select * from user where user_id = ? AND user_pw = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, inputId);
        pstmt.setString(2, inputPw);

        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            return true;
        } else {
            return false;
        }
    }


        public void create(DiaryVO diaryVO) throws Exception{
            String createSql = "insert into diary(id, title, content, created_date, updated_date, user_id) values (?,?,?,?,?,?)";
            PreparedStatement createPstmt = conn.prepareStatement(createSql);
            createPstmt.setString(1, diaryVO.getId());
            createPstmt.setString(2, diaryVO.getTitle());
            createPstmt.setString(3, diaryVO.getContent());
            createPstmt.setString(4, diaryVO.getCreatedDate());
            createPstmt.setString(5, diaryVO.getUpdatedDate());
            createPstmt.setString(6, diaryVO.getWriter());
            createPstmt.execute();
        }

        //read
        public List<DiaryVO> read(String username) throws SQLException {
            List<DiaryVO> diaryVOList = new ArrayList<>();
            String readSql = "select * from diary where user_id = ?";
            PreparedStatement readPstmt = conn.prepareStatement(readSql);
            readPstmt.setString(1, username);

            ResultSet readRs = readPstmt.executeQuery();
            while (readRs.next()){
                String id  = readRs.getString("id");
                String title = readRs.getString("title");
                String content = readRs.getString("content");
                String createdDate = readRs.getString("created_date");
                String updatedDate = readRs.getString("updated_date");
                String writer = readRs.getString("user_id");

                DiaryVO diaryVO = new DiaryVO(id, title, content, createdDate, updatedDate, writer);
                diaryVOList.add(diaryVO);
            }
            return diaryVOList;
        }

        public void update(DiaryVO diaryVO) throws SQLException {
        String updateSql = "update diary set title = ?, content = ?, updated_date = ? where id = ?";
        PreparedStatement updatePstmt = conn.prepareStatement(updateSql);
        updatePstmt.setString(1, diaryVO.getTitle());
        updatePstmt.setString(2, diaryVO.getContent());
        String updatedDate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        updatePstmt.setString(3, updatedDate);
        updatePstmt.setString(4, diaryVO.getId());
        updatePstmt.execute();
        }

        public void delete(String deleteId) throws SQLException {
        String deleteSql = "delete from diary where id = ?";
        PreparedStatement deletePstmt = conn.prepareStatement(deleteSql);
        deletePstmt.setString(1, deleteId);
        deletePstmt.execute();
        }
    }


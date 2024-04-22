package FindLongestDiary2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAO {
    Connection conn;

    public DAO(String url, String id, String pw) throws SQLException {
        conn = DriverManager.getConnection(url, id, pw);
    }

    public boolean login(String inputId, String inputPw) throws SQLException {
        String sql = "select * from user where user_id = ? AND user_pw = ?";
        PreparedStatement loginPstmt = conn.prepareStatement(sql);

        loginPstmt.setString(1, inputId);
        loginPstmt.setString(2, inputPw);

        ResultSet loginRs = loginPstmt.executeQuery();

        if (loginRs.next()) {
            return true;
        } else {
            return false;
        }
    }

    public List<DiaryVO> reload(String username) throws Exception {
        List<DiaryVO> diaryVOList = new ArrayList<>();
        String readSql = "select * from diary where user_id = ?";
        PreparedStatement readPstmt = conn.prepareStatement(readSql);

        readPstmt.setString(1, username);

        ResultSet readRs = readPstmt.executeQuery();

        while (readRs.next()) {
            String id = readRs.getString("id");
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
}


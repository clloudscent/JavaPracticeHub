package jan06DAOPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DAO {
    Connection conn;

    public DAO(String url, String id, String pw) throws Exception {
        conn = DriverManager.getConnection(url, id, pw);
    }

    public boolean login(String inputId, String inputPw) throws Exception {
        String sql = "select * from user where user_id = ? AND user_pw =?";
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


    public List<DiaryVO> read(String userId) throws Exception {
        List<DiaryVO> diaryVOList = new ArrayList<>();
        String sql = "select * from diary where user_id =?";
        String sql2 = new String("select * from diary");
        PreparedStatement readPstmt = conn.prepareStatement(sql);
        readPstmt.setString(1, userId);
        ResultSet readRs = readPstmt.executeQuery();

        while (readRs.next()) { //resultSet을 하는 이유에 대해 정확하게 모르겠습니다.
            String id = readRs.getString("id");
            String title = readRs.getString("title");
            String content = readRs.getString("content");
            String createdDate = readRs.getString("created_date");
            String updatedDate = readRs.getString("updated_date");
            String writer = readRs.getString("user_id");

            DiaryVO diaryVO = new DiaryVO(id, title, content, createdDate, updatedDate, writer); //이 코드가 diaryVO객체를 생성하고, 생성자 메소드를 통해 매개변수로 id~writer의 값이 diaryVO 객체로 들어가는 것인가요? DiaryVO diaryVO 를 했을 때, 어떤식으로 메모리공간안에 생성이 되나요?
            DiaryVO diaryVO2 = DiaryHandler.makeMyDiary();
            diaryVOList.add(diaryVO);
        }
        return diaryVOList;
    }

    public void update(DiaryVO diaryVO) throws Exception {
        String sql = "update diary set title =?, content = ?, updated_date =? where id =?";
        PreparedStatement updatePstmt = conn.prepareStatement(sql);
        updatePstmt.setString(1, diaryVO.getTitle());
        updatePstmt.setString(2, diaryVO.getContent());
        updatePstmt.setString(3, diaryVO.getUpdatedDate());
        updatePstmt.setString(4, diaryVO.getId());

        updatePstmt.execute();
    }

    public void create(DiaryVO diaryVO) throws Exception {
        String sql = "insert into diary(id, title, content, created_date, updated_date, user_id) values (?,?,?,?,?,?)";
        PreparedStatement createPstmt = conn.prepareStatement(sql);
        createPstmt.setString(1, diaryVO.getId());
        createPstmt.setString(2, diaryVO.getTitle());
        createPstmt.setString(3, diaryVO.getContent());
        createPstmt.setString(4, diaryVO.getCreatedDate());
        createPstmt.setString(5, diaryVO.getUpdatedDate());
        createPstmt.setString(6, diaryVO.getWriter());
        createPstmt.execute();
    }

    public void delete(String deleteId) throws Exception {
        String sql = "delete from diary where id = ?";

        PreparedStatement deletePstmt = conn.prepareStatement(sql); //PrepareStatement타입의 객체를 통해 ?에 해당하는 곳으로 데이터 전달한다. 그래서 PrepareStatement 타입의 deletePstmt객체를 만들고, Connection 메소드 중 하나인 prepareStatement 메소드에 접근하기 위해 만들어준 Connection
        //타입의 객체 conn을 통해 Connection 클래스 메소드에 접근하여, conn.을 통해 prepareStatement 메소드에 접근한 후, 해당 메소드의 매개변수로 작성해준 String 타입의 참조형변수 sql을 넣고, ?에 해당하는 곳에 값을 넣기 위해, PrepareStatement 객체인 deletePstmt . 을 통해 setString메소드에 접근하여
        //? 순서인 1과 넣어줄 String 파라미터값을 각각 넣어준다. 그리고 execute를 하면 완성된 sql이 db로 전달된다.
        //로 해석했는데 맞게 생각했는지 잘모르겠습니다.
        deletePstmt.setString(1, deleteId);
        deletePstmt.execute();

    }


    public String findUser(List<DiaryVO> diaryVOList) {
        List<DiaryVO> diaryList = new ArrayList<>();

        Map<String, Integer> diaryMap = new HashMap<>();
        //key : 일기작성자  value : 일기 갯수
        for (int i = 0; i < diaryList.size(); i++) {
//            if(diaryList.get(i).getWriter().equals()){
//                diaryMap.put(diaryList.get(i).getWriter(), diaryList.get(i).getId());
//            };

        }

        return null;
    }
}


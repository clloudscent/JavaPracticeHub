package RecordNov17;


import javax.print.DocFlavor;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class DAO {
    Connection conn;

    public DAO(String url, String id, String pw) throws SQLException {
        conn = DriverManager.getConnection(url, id, pw);
    }

    //logIn
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

    public void create(DiaryVO diaryVO) throws SQLException {
        String createSql = "insert into diary(title, content, created_date, updated_date, user_id) values (?,?,?,?,?)";
        PreparedStatement createPstmt = conn.prepareStatement(createSql);

        createPstmt.setString(1, diaryVO.getTitle());
        createPstmt.setString(2, diaryVO.getContent());
        createPstmt.setString(3, diaryVO.getCreatedDate());
        createPstmt.setString(4, diaryVO.getUpdatedDate());
        createPstmt.setString(5, diaryVO.getWriter());
        createPstmt.execute();
    }

    public List<DiaryVO> read(String userId) throws SQLException {
        List<DiaryVO> diaryList = new ArrayList<>();
        String readSql = "select * from diary where user_id = ?";
        PreparedStatement readPstmt = conn.prepareStatement(readSql);
        readPstmt.setString(1, userId);

        ResultSet readRs = readPstmt.executeQuery();

        while (readRs.next()) {
            String id = readRs.getString("id");
            String title = readRs.getString("title");
            String content = readRs.getString("content");
            String createdDate = readRs.getString("created_date");
            String updatedDate = readRs.getString("updated_date");
            String writer = readRs.getString("user_id");

            DiaryVO diaryVO = new DiaryVO(id, title, content, createdDate, updatedDate, writer);
            diaryList.add(diaryVO);
        }
        return diaryList;
    }


    public void update(DiaryVO diaryVO) throws SQLException {
        String updateSql = "update diary set title = ?, content = ?, updated_date = ? where id = ?";
        PreparedStatement updatePstmt = conn.prepareStatement(updateSql);
        updatePstmt.setString(1, diaryVO.getTitle());
        updatePstmt.setString(2, diaryVO.getContent());
        updatePstmt.setString(3, diaryVO.getUpdatedDate());
        updatePstmt.setString(4, diaryVO.getId());
        updatePstmt.execute();
    }

    public void delete(String deleteId) throws SQLException {
        String deleteSql = "delete from diary where id = ?";
        PreparedStatement deletePstmt = conn.prepareStatement(deleteSql);
        deletePstmt.setString(1, deleteId);
        deletePstmt.execute();
    }

    /*public DiaryVO textLengthCheck() throws SQLException {
        List<DiaryVO> diaryTextList = new ArrayList<>();

        String longestText = "select * from diary where id = ?";
        PreparedStatement longestTextPstmt = conn.prepareStatement(longestText);
        String longestTextId = "";
        for(int i=0; i<diaryTextList.size()-1; i++){
            if(diaryTextList.get(i).getContent().length()<diaryTextList.get(i).getContent().length()+1){
                longestTextId = diaryTextList.get(i).getId();
            }
        }
        longestTextPstmt.setString(1, longestTextId);
        ResultSet rs = longestTextPstmt.executeQuery();

        return diaryTextList;
    }*/
    public DiaryVO diaryWithInputDate(List<DiaryVO> diaryVOList, String inputDate) {
        DiaryVO result = null;
        for (int i = 0; i < diaryVOList.size(); i++) {
            if (diaryVOList.get(i).getCreatedDate().equals(inputDate)) {
                result = diaryVOList.get(i);
            }
        }
        return result;
    }

    public String userTop(List<DiaryVO> diaryVOUserList) {
        List<UserVO> userList = new ArrayList<>();

        for (int i = 0; i < diaryVOUserList.size(); i++) {
            String currentUserIdOfThisDiary = diaryVOUserList.get(i).getWriter();

            boolean isUserNotExist = true;

            for (int j = 0; j < userList.size(); j++) {
                UserVO currentUserVO = userList.get(j);
                if (currentUserVO.userId.equals(currentUserIdOfThisDiary)) {
                    currentUserVO.numOfWritten++;
                    isUserNotExist = false;
                    break;
                }
            }

            if (isUserNotExist) {
                UserVO userToAdd = new UserVO();
                userToAdd.userId = currentUserIdOfThisDiary;
                userToAdd.numOfWritten = 1;
                userList.add(userToAdd);
            }
        }

        int maxNum = 0;
        String bestUserId = null;
        for (int i = 0; i < userList.size(); i++) {
            UserVO currentUser = userList.get(i);
            System.out.println("UserId: "+currentUser.userId+", count: "+currentUser.numOfWritten);
            if(currentUser.numOfWritten >= maxNum) {
                maxNum = currentUser.numOfWritten;
                bestUserId = currentUser.userId;
            }
        }

        return bestUserId;
    }

    public List<DiaryVO> readAllDiary() throws SQLException {
        //DiaryVO 를 담는 list 객체 생성
        List<DiaryVO> diaryList = new ArrayList<>();
        //DB에 요청할 조회쿼리를 담는 문자열 변수 선언 및 값 저장
        String readSql = "select * from diary";
        //DB에 쿼리 전달 및 데이터를 가져올 PreparedStatement 변수 선언 및 객체 생성 후 저장
        PreparedStatement readPstmt = conn.prepareStatement(readSql);

        ResultSet readRs = readPstmt.executeQuery();

        //ResultSet에 다음 데이터가 존재하는 동안 루프문 수행
        while (readRs.next()) {
            String id = readRs.getString("id");
            String title = readRs.getString("title");
            String content = readRs.getString("content");
            String createdDate = readRs.getString("created_date");
            String updatedDate = readRs.getString("updated_date");
            String writer = readRs.getString("user_id");

            DiaryVO diaryVO = new DiaryVO(id, title, content, createdDate, updatedDate, writer);
            diaryList.add(diaryVO);
        }
        return diaryList;
    }

    public String writerTop(List<DiaryVO> diaryVOList){

        UserVO userVO = new UserVO();
        //UserVO타입의 List인 userVOList를 만든다. 그리고 그 리스트에는 new를 통해 ArrayList<>()를 담는다.
        List<UserVO> userVOList = new ArrayList<>();

       //diaryVOList에 모두 접근하기위해 i를 0부터 diaryVOList가 해당 크기만큼 돌동안 i가 1씩 증가하는 for문을 작성해준다.
        for(int i =0; i<diaryVOList.size(); i++){
            //String 타입의 diaryWriter에 diaryVO리스트의  i번째의 getWriter()메소드를 통해 작성자를 담아준다.
            String diaryWriter = diaryVOList.get(i).getWriter();
            //boolean타입의 userVOListEmpty에 true값을 담아준다. userVO안에 값이 담겨있는지에 대한 여부를 알아야하기때문이다.
            boolean userVOListEmpty = true;
            //userVOList에 모두 접근하기위해 userVOList를 모두 도는 for문을 작성해준다.
            for(int j=0; j<userVOList.size(); j++){
                //UserVO타입의 userVO1에 userVOList의 i번째 값을 담아준다.
                UserVO userVO1 = userVOList.get(j);
                //UserVOList의 i번째의 userId와 diaryWriter가 일치하는지에 대해 if조건문을 작성해주었다.
                if(diaryWriter.equals(userVOList.get(i).userId)){
                    //만약 if문에 해당하는 조건을 만족한다면 현재 i번째의 일기에 해당하는 작성자와 userVO에 해당하는 작성자가 일치한단 뜻이고
                    //해당 작성자가 일기를 작성했다는 뜻이므로 일기를 썼다는 걸 세주기위해 userVO1의 userId값에 diaryWriter를 넣어준다.
                    userVO1.userId = diaryWriter;
                    //userVO1의 numOfWritten이라는 변수에 ++을 통해 값을 1 증가시킨다.
                    userVO1.numOfWritten++;
                    //이제 userVOList에 값이 존재하므로, userVOListEmpty의 boolean값을 false로 바꿔주고 for문을 종료시킨다.
                    userVOListEmpty = false;
                    break;
                }

            }
            //만약 userVOList가 true일때 해당 if문을 만족한다. userVOListEmpty가 true라는 것은 현재 userVOList에 아무값도 담겨 있지 않은 상ㅌ를 뜻한ㄷ.
            if(userVOListEmpty){
                //userVO타입의 userVO2라는 변수를 선언해준다. 그리고 그 변수에 UserVO 생성ㅇ자를 통해 userVO를 넣어준다.
                UserVO userVO2 = new UserVO();
                //userVO2에는 현재 값이 담겨있지않고, userVO2의 userId를 위에서 선언해준 i번째의 diaryWriter를 담아준다.
                userVO2.userId = diaryWriter;
                //userVO2의 numOfWritten에 1을 담아준다.
                userVO2.numOfWritten = 1;
            }
        }
        int numberOfDiary = 0;
        String winner = null;

        for(int i=0; i<userVOList.size(); i++){
            if(userVOList.get(i).numOfWritten>numberOfDiary){
                winner = userVOList.get(i).userId;
            }
        }
        return winner;

    }

    public String findTopUser(List<DiaryVO> diaryVOList){
        List<UserVO> userVOList = new ArrayList<>();

        for(int i = 0; i< diaryVOList.size(); i++){
            String userOfThisDiary = diaryVOList.get(i).getWriter();
            boolean userEmpty = true;
            for(int j = 0; j<userVOList.size(); j++){
                UserVO userVO = userVOList.get(j);
                if(userVO.userId.equals(userOfThisDiary)){
                    userVO.numOfWritten ++;
                    userEmpty = false;
                    break;
                }
            }
            if(userEmpty){
                UserVO userVO2 = new UserVO();
                userVO2.userId = userOfThisDiary;
                userVO2.numOfWritten = 1;
                userVOList.add(userVO2);
            }
        }
        int diaryCount = 0;
        String winner = "";

        for(int i =0; i<userVOList.size(); i++){
            UserVO user = userVOList.get(i);

            System.out.println("userid: "+user.userId+", count: "+user.numOfWritten);

            if(user.numOfWritten>=diaryCount){
                diaryCount = user.numOfWritten;
                winner = user.userId;
            }
        }
        return  winner;
    }
}

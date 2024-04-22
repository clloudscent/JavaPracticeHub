package feb9;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAO {
        Connection conn;

        public DAO(String url, String id, String pw) throws Exception{
            conn = DriverManager.getConnection(url, id, pw);
        }

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

        public void joinMember(MemberVO memberVO) throws Exception{
            String sql = "insert into member (" +
                    "tel_id, " +
                    "name, " +
                    "current_point, " +
                    "total_point," +
                    "grade, " +
                    "admin_id) " +
                    "values (?,?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, memberVO.getTelId());
            pstmt.setString(2, memberVO.getName());
            pstmt.setInt(3, memberVO.getCurrentPoint());
            pstmt.setInt(4, memberVO.getTotalPoint());
            pstmt.setString(5, memberVO.getGrade());
            pstmt.setString(6, memberVO.getAdminId());
            pstmt.execute();
        }

        //2. 회원정보수정
        public void updateMember(MemberVO memberVO) throws Exception{
            String sql = "update member set tel_id = ?, name = ? where admin_id = ?";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, memberVO.getTelId());
            pstmt.setString(2, memberVO.getName());
            pstmt.setString(3, memberVO.getAdminId());
            pstmt.execute();
        }

        public void updatePoint(MemberVO memberVO)throws Exception{
            String sql = "update member set current_point = ?, total_point = ? where tel_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, memberVO.getCurrentPoint());
            pstmt.setInt(2, memberVO.getTotalPoint());
            pstmt.setString(3, memberVO.getTelId());
            pstmt.execute();
        }

        //3. 회원정보 불러오기
        public List<MemberVO> viewMember(String adminId) throws Exception {
            List<MemberVO> memberVOList = new ArrayList<>();
            String sql = "select * from member where admin_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, adminId);

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                String telId = rs.getString("tel_id");
                String name = rs.getString("name");
                int currentPoint = rs.getInt("current_point");
                int totalPoint = rs.getInt("total_point");
                String grade = rs.getString("grade");
                String admin = rs.getString("admin_id");
                MemberVO memberVO = new MemberVO(telId, name, currentPoint, totalPoint, grade, admin);
                memberVOList.add(memberVO);
            }
            return memberVOList;
        }

        public MemberVO readMemberById(String memberId)throws Exception{
            MemberVO result = null;
            String sql = "select * from member where tel_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, memberId);

            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                String telId = rs.getString("tel_id");
                String name = rs.getString("name");
                int currentPoint = rs.getInt("current_point");
                int totalPoint = rs.getInt("total_point");
                String grade = rs.getString("grade");
                String admin = rs.getString("admin_id");
                result = new MemberVO(telId, name, currentPoint, totalPoint, grade, admin);
            }
            return result;

        }

        //4. 포인트 적립하기
        public void inputPoint() throws Exception{

        }

        //5. 포인트 사용하기
        public void usePoint() throws Exception{

        }

        //6. 회원삭제
        public void deleteMember(String deleteId) throws Exception{
            String sql = "delete from member where tel_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, deleteId);
            pstmt.execute();
        }
    }

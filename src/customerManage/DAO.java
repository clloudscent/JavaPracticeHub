package customerManage;

import Dec21.DiaryVO;

import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class DAO {
    Connection conn;

    public DAO(String url, String id, String pw) throws Exception{
        conn = DriverManager.getConnection(url, id, pw);
    }

    public boolean logIn(String inputId, String inputPw) throws Exception{
        String sql = "select * from user where user_id = ? AND user_pw = ?";

        Statement stmt;

        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, inputId);
        pstmt.setString(2, inputPw);

        //로그인 검증 과정
        ResultSet rs = pstmt.executeQuery(); //코드해석 질문
        if(rs.next()){
            return true;
        }else{
            return false;
        }
    }

    public void inputCustomer(CustomerVO customerVO) throws Exception{
        String sql = "insert into customer (id, name, grade, update_date, manager) values (?,?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, customerVO.getId());
        pstmt.setString(2, customerVO.getName());
        pstmt.setString(3, customerVO.getGrade());
        String today = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        pstmt.setString(4, customerVO.getUpdatedDate(today));
        pstmt.setString(5, customerVO.getManager());

        pstmt.execute();
    }

    public void inputPurchase(CustomerVO customerVO, int inputId) throws Exception{
        int balance = getPurchaseValueFromId(inputId);
        balance += customerVO.getPurchase();
        String sql = "update customer set purchase = ?, update_date = ? where id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, balance);
        String today = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        pstmt.setString(2, today);
        pstmt.setString(3, customerVO.getId());

        pstmt.execute();
    }

    public Integer getPurchaseValueFromId(Integer id) throws  Exception{
        List<CustomerVO> customerVOList = new ArrayList<>();
        String sql = "select purchase from customer where id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();
        int purchase = 0;
        if(rs.next()){
            purchase = rs.getInt("purchase");
        }
        return purchase;

    }

    public List<CustomerVO> viewCustomer(String userId) throws Exception {
        List<CustomerVO> customerVOList = new ArrayList<>();
        String sql = "select * from customer where manager = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, userId);

        ResultSet rs = pstmt.executeQuery(); //코드해석 질문

        while (rs.next()) {
            String id = rs.getString("id");
            String name = rs.getString("name");
            String grade = rs.getString("grade");
            int purchase = rs.getInt("purchase");
            String updatedDate = rs.getString("update_date");
            CustomerVO customerVO = new CustomerVO(id, name, grade, purchase, updatedDate);
            customerVOList.add(customerVO);
        }
        return customerVOList;
    }

    public void updateCustomerBalance(CustomerVO customerVO, int id) throws Exception{
        int balance = getPurchaseValueFromId(id);
        balance -= customerVO.getPurchase();
        String sql = "update customer set purchase = ?, update_date = ? where id = ?";
        PreparedStatement updatePstmt = conn.prepareStatement(sql);
        updatePstmt.setInt(1, balance);
        String today = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        updatePstmt.setString(2, today);
        updatePstmt.setString(3, customerVO.getId());
        updatePstmt.execute();
    }

    public void delete(String deleteId) throws Exception{
        String sql = "delete from customer where id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, deleteId);
        pstmt.execute();
    }
}

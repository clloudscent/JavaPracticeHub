package feb15Dao;

import java.sql.DriverManager;

public class Process {
    public static void main(String[] args) throws Exception {
        String jdbcUrl = "jdbc:mysql://localhost:3306/practice";
        String user = "airplane";
        String password = "airplane1234";
//        DAO dao = new DAO(jdbcUrl, user, password);
        DAO dao = new DAO();
//        dao.conn = DriverManager.getConnection(jdbcUrl, user, password);
//        DAO dao = new DAO(jdbcUrl,user, password);

        if (dao.login("dooli", "4321")) {
            System.out.println("로그인 성공");
        }else{
            System.out.println("로그인 실패");
        }

    }
}

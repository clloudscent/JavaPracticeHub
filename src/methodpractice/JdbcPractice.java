package methodpractice;


import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcPractice {
    public static void main(String[] args) throws Exception{
        DAO dao = createDAO();

    }

    public static Student createStudent(){
        Student student = new Student();
        student.name = "홍길동";
        student.jumin = "970202-1234567";
        return student;
    }

    public static DAO createDAO()throws Exception{
        DAO dao = new DAO();

        return dao;
    }
}

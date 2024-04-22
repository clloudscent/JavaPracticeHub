package methodpractice;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
    Connection conn;

    public DAO() throws Exception{
        conn = DriverManager.getConnection("jdbcUrl");
    }
}

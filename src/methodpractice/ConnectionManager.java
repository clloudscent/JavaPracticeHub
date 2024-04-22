package methodpractice;

import java.sql.Connection;

public class ConnectionManager {
    public static Connection getConnection(){
        return new MyConnection();
    }
}

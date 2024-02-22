package DB_CONN;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {
    public static Connection conn(){
        try {
            Connection  conn = DriverManager.getConnection("jdbc:mysql://localhost/gestion_presence", "root", "");
            return conn;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

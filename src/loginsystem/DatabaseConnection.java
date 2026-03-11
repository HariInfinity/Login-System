package LoginSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DatabaseConnection {
    
    final String url = "jdbc:derby://localhost:1527/loginsystem";
    final String username = "root";
    final String password = "root";
    
    public DatabaseConnection() {
        try {
             Connection dm = DriverManager.getConnection(url, username, password);

            String tableQuery
                    = "CREATE TABLE user ("
                    + "id INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY, "
                    + "email VARCHAR(255), "
                    + "password VARCHAR(255)"
                    + ")";
            Statement st = dm.createStatement();
            st.execute(tableQuery);
        } catch (SQLException ex) {
        ex.printStackTrace();
            System.out.println("database connection error");
        }
    }
    
}

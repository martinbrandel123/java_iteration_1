package BDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.PrimitiveIterator;


public class MyJDBC {
    private String username;
    private String password;
    private String dataUrl;

    public MyJDBC() {
        this.username = "martin";
        this.password = "azerty";
        this.dataUrl = "jdbc:mysql://localhost:3306/donjon_dragon";
    }

    public Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        // crée une connection
        Connection connection = DriverManager.getConnection(dataUrl, username, password );
        return connection;
    }
}

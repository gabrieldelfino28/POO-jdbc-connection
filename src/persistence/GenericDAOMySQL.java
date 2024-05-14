package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
@SuppressWarnings("all")
public class GenericDAOMySQL {

    private Connection connection;
    public GenericDAOMySQL() {
        super();
    }

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        String hostName = "localhost";
        String dbName = "mydatabase";
        String user = "root";
        String password = "root@Gabe";

        connection = DriverManager.getConnection(
                String.format("jdbc:mysql://%s:3306/%s", hostName, dbName), user, password
        );

        return connection;
    }

}

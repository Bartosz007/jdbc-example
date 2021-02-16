package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import static java.lang.System.exit;

public class Database {

    private Connection connection;
    private Properties properties;

    public Database() {

        try {
            Class.forName("org.postgresql.Driver");
            properties = new Properties();
            properties.setProperty("user", ConnectionData.USER);
            properties.setProperty("password", ConnectionData.PASSWORD);

        } catch (Exception e) {
            System.err.println(e.getMessage());
            exit(1);
        }

    }

    public Connection open() throws SQLException {
        connection = DriverManager.getConnection(ConnectionData.URL, properties);
        return connection;
    }


    public void close() throws SQLException {
        connection.close();
    }

}

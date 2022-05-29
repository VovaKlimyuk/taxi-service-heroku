package taxi.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {
    private static final String URL = "jdbc:mysql://sql4.freesqldatabase.com:3306/sql4496149";
    private static final String USERNAME = "sql4496149";
    private static final String PASSWORD = "lrh5IUPeeM";

    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String TIME_ZONE = "?serverTimezone=UTC";

    static {
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Can't find SQL Driver", e);
        }
    }

    public static Connection getConnection() {
        Properties dbProperties = new Properties();
        dbProperties.setProperty("user", USERNAME);
        dbProperties.setProperty("password", PASSWORD);
        try {
            return DriverManager.getConnection(URL + TIME_ZONE, dbProperties);
        } catch (SQLException e) {
            throw new RuntimeException("Can't create connection to DB ", e);
        }
    }
}

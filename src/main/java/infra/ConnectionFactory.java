package infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionFactory {

    private ConnectionFactory() {
    }

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/ifbeauty",
                    "postgres", "02082001@UaU");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}


import java.sql.DriverManager;
import java.sql.SQLException;

public class Medium {

    public static void doSomething() throws SQLException {
        DriverManager.getConnection("10.11.12.13", "sa", "password");
    }
}
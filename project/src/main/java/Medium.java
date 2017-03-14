import java.sql.DriverManager;
import java.sql.SQLException;

public class Medium {

    void main(javax.servlet.http.HttpServletRequest req, java.sql.Statement stat)
    {
        String paramName = req.getParameter("rating");
        String sSQL="";
        sSQL = "update items set rating=rating+" + paramName;
        stat.executeUpdate(sSQL);
    }
}
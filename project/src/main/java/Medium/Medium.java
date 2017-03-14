package medium;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Medium {

    private HttpServletRequest request = null;
    private HttpServletResponse response = null;

    public static void updateProfle(String SSNumber)
    {
        String newSSN = formatSSN(this, SSNumber);
        System.out.println("Social Security Number valid: " + newSSN);
    }
}
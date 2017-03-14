import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.servlet.jsp.JspWriter;

public class Small
{
     public static void doSomthing(String fName)  {
	try {
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("JavaScript");
		System.out.println(fName);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
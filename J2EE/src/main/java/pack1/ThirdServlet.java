package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/ThirdServlet")
public class ThirdServlet extends GenericServlet
{
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void service(ServletRequest req,ServletResponse res)
 {
	 try {
		PrintWriter pw=res.getWriter();
		 pw.println("welcome servlet");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
 }
}

package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/FourthServlet")
public class FourthServlet  extends GenericServlet
{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void service(ServletRequest req,ServletResponse res)
  {
	  try {
		PrintWriter pw=res.getWriter();
		  pw.println("<html><body bgcolor=red><h1>");
		  pw.println("welcome to servlet2");
		  pw.println("</h1></body></html>");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}

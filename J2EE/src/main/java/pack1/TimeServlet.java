package pack1;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/TimeServlet")
public class TimeServlet extends GenericServlet
{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void service(ServletRequest req,ServletResponse res)
  {
	  try {
		LocalTime lt=LocalTime.now();
		  PrintWriter pw=res.getWriter();
		  pw.println("<html><body bgcolor=orange><h2>");
		  pw.println(lt);
		  pw.println("</h2></body></html>");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}

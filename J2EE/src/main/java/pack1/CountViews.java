package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/CountViews")
public class CountViews  extends GenericServlet
{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
int count=0;
  public void service(ServletRequest req,ServletResponse res)
  {	
	  try {
		count++;
		  PrintWriter pw =res.getWriter();
		  pw.println("<html><body bgcolor=yellow ><h1>");
		  pw.println("this page has been accessed "+count+" times");
		  pw.println("</h1></body></html>");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}

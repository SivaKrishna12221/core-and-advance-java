package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/test")
public class MathTable extends GenericServlet
{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void service(ServletRequest req,ServletResponse res)
   {
	   try {
		PrintWriter pw=res.getWriter();
		   pw.println("<html><body bgcolor=yellow>");
		   pw.println("<table border=20>");
		   for(int i=1;i<=10;i++)
		   {
			   pw.println("<tr><td>5</td>");
			   pw.println("<td>*</td>");
			   pw.println("<td>"+i+"</td>");
			   pw.println("<td>=</td>");
			   pw.println("<td>"+5*i+"</td>");
			   pw.println("</tr>");
			   pw.println("</body></html>");
		   }
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
}

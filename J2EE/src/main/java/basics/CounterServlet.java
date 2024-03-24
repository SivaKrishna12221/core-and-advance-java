package basics;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;


public class CounterServlet extends GenericServlet 
{
	int count=0;//one time memory is allocated so we choose it
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		count++;
	    PrintWriter pw=response.getWriter();
	    pw.println("<html><body bgcolor=green color=red");
	    pw.println("<h1>This page has been accessed "+count+"times</h1>");
	    pw.println("</body></html>");
		
	}

}

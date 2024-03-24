package http;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class GetHiddenField
 */
public class GetHiddenField extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String s1=request.getParameter("product1");
	String s2=request.getParameter("product2");
	String s3=request.getParameter("product3");
	String s4=request.getParameter("product4");
	PrintWriter pw=response.getWriter();
	pw.println("<html><body bgcolor=orange text=blue><center><h1>");
    pw.println("your selected products are:<br>");
    if(!(s1.equals(null)))
    {
    	pw.println(s1+"<br>");
    }
    if(!(s2.equals(null)))
    {
    	pw.println(s2+"<br>");
    }
    if(!(s3.equals(null)))
    {
    	pw.println(s3+"<br>");
    }
    if(!(s4.equals(null)))
    {
    	pw.println(s4+"<br>");
    }
	pw.println("</h1></center></body></html>");
	}

}

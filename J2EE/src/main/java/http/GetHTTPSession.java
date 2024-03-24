package http;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class GetHTTPSession
 */
public class GetHTTPSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	HttpSession hs=request.getSession();
    String s1=(String) hs.getAttribute("product1");//here the data is converted into 
	String s2=(String)hs.getAttribute("product2");
	String s3=(String)hs.getAttribute("product3");
	String s4=(String)hs.getAttribute("product4");
	PrintWriter pw=response.getWriter();
	pw.println("<html><body bgcolor=orange text=green><center><h1>");
	pw.println("your selected products are:<br>");
	if(s1!=null)
	{
		pw.println(s1+"<br>");
	}
	if(s2!=null)
	{
		pw.println(s2+"<br>");
		
	}
	if(s3!=null)
	{
		pw.println(s3+"<br>");
	}
	if(s4!=null)
	{
		pw.println(s4+"<br>");
	}
	pw.println("</h1></center></body></html>");
	}

}

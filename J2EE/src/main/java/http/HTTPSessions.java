package http;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Servlet implementation class HTTPSessions
 */
@WebServlet("/httpsession")
public class HTTPSessions extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	   HttpSession  hs=request.getSession();
	   PrintWriter pw=response.getWriter();
	   pw.println("<html><body bgcolor=orange text=blue><h1>");
	   pw.println(hs.getId()+"<br>");
	   pw.println( new Date(hs.getCreationTime())+"<br>");
	   pw.println(new Date(hs.getLastAccessedTime())+"<br>");
	   pw.println(hs.getMaxInactiveInterval()+"second "+"<br>");
	   
	   pw.println("</h1></body></html>");
	}

}

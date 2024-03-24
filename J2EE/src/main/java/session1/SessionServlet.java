package session1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionServlet
 */
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	  PrintWriter pw=response.getWriter();
	  pw.println("<html><body bgcolor=orange text=blue><h1>");
	  HttpSession hs=request.getSession();
	  pw.println(hs.getId()+"<br>");
	  pw.println(new Date(hs.getCreationTime())+"<br> ");
	  pw.println(new Date(hs.getLastAccessedTime())+"<br>");
	  pw.println(hs.getMaxInactiveInterval()+"seconds"+"<br>");
	  pw.println("</h1><body></html>");
	}

}

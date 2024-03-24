package session2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SetSession
 */
public class SetSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SetSession() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	  String s1=request.getParameter("mobile1");
	  String s2=request.getParameter("mobile2");
	  String s3=request.getParameter("mobile3");
	  String s4=request.getParameter("mobile4");
	  String s5=request.getParameter("mobile5");
	  HttpSession hs=request.getSession();
	  hs.setAttribute("mobile1",s1);
	  hs.setAttribute("mobile2",s2);
	  hs.setAttribute("mobile3",s3);
	  hs.setAttribute("mobile4",s4);
	  hs.setAttribute("mobile5",s5);
	  PrintWriter pw=response.getWriter();
	  pw.println("<html><body bgcolor=red text=blue><center>");
	  pw.println("<h1>your  mobiles are added to cart</h1>");
	  pw.println("<a href=getsession>next</a>");
	  pw.println("</center></body></html>");
	}

}

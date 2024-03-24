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
 * Servlet implementation class GetSession
 */
public class GetSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetSession() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter pw=response.getWriter();
		HttpSession hs=request.getSession();
		String s1=(String)hs.getAttribute("mobile1");
		String s2=(String)hs.getAttribute("mobile2");
		String s3=(String)hs.getAttribute("mobile3");
		String s4=(String)hs.getAttribute("mobile4");
		String s5=(String)hs.getAttribute("mobile5");
		pw.println("<html><body bgcolor=yellow text=blue>");
		pw.println("<h1>selected mobiles are:</h1>");
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
		if(s5!=null)
		{
			pw.println(s5+"<br>");
		
		}
		pw.println("</body></html>");
		
	}

}

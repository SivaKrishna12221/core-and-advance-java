package url11;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Set
 */
@WebServlet("/set")
public class Set extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Set() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String s1=request.getParameter("book1");
		String s2=request.getParameter("book2");
		String s3=request.getParameter("book3");
		String s4=request.getParameter("book4");
		String s5=request.getParameter("book5");
		PrintWriter pw=response.getWriter();
		pw.println("<html><body bgcolor=green text=blue>");
		pw.println("<h1> your books are added to cart</h1>");
		pw.println("<a href=get?b1="+s1+"&b2="+s2+"&b3="+s3+"&b4="+s4+"&b5="+s5+">Next</a>");
		pw.println("</body></html>");
		
	}

}

package url11;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Get
 */
@WebServlet("/get")
public class Get extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Get() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter pw=response.getWriter();
		String s1=request.getParameter("b1");
		String s2=request.getParameter("b2");
		String s3=request.getParameter("b3");
		String s4=request.getParameter("b4");
		String s5=request.getParameter("b5");
		pw.println("<html><body bgcolor=yellow text=blue>");
		pw.println("<h1>Selected Books:</h1>");
		if(!(s1.equals("null")))
		{
			pw.println(s1+"<br>");
		}
		if(!(s2.equals("null")))
		{
			pw.println(s2+"<br>");
		}
		if(!(s3.equals("null")))
		{
			pw.println(s3+"<br>");
		}
		if(!(s4.equals("null")))
		{
			pw.println(s4+"<br>");
		}
		if(!(s5.equals("null")))
		{
			pw.println(s5+"<br>");
		}
		pw.println("</body></html>");
	}

}

package hiddenFields;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class GetFields
 */
public class GetFields extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetFields() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String s1=request.getParameter("product1");
		String s2=request.getParameter("product2");
		String s3=request.getParameter("product3");
		String s4=request.getParameter("product4");
		String s5=request.getParameter("product5");
		PrintWriter pw=response.getWriter();
		pw.println("<html><body bgcolor=yellow text=blue><center>");
		pw.println("<h1>selected products are:");
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
		
		pw.println("</center></body></html>");
	}

}

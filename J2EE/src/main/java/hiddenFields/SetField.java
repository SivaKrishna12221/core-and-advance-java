package hiddenFields;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SetField
 */
public class SetField extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SetField() {
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
		pw.println("<html><body bgcolor=orange text=blue><center>");
		pw.println("<h1>Your products are added to cart<h1>");
		pw.println("<form action=getfield>");
		pw.println("<input type=hidden name=product1 value="+s1+">");
		pw.println("<input type=hidden name=product2 value="+s2+">");
		pw.println("<input type=hidden name=product3 value="+s3+">");
		pw.println("<input type=hidden name=product4 value="+s4+">");
		pw.println("<input type=hidden name=product5 value="+s5+">");
		pw.println("<input type=submit value=next>");
		pw.println("</form></body></html>");
	}

}

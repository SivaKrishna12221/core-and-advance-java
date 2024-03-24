package http;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SetHiddenField
 */
public class SetHiddenField extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	  String s1=request.getParameter("product1");
	  String s2=request.getParameter("product2");
	  String s3=request.getParameter("product3");
	  String s4=request.getParameter("product4");
	  PrintWriter pw=response.getWriter();
	  pw.println("<html><body bgcolor=orange text=blue><centre><h1>");
	  pw.println("<form action=gethiddenfield>");
	  pw.println("<input type=hidden name=product1 value="+s1+">");
	  pw.println("<input type=hidden name=product2 value="+s2+">");
	  pw.println("<input type=hidden name=product3 value="+s3+">");
	  pw.println("<input type=hidden name=product4 value="+s4+">");
	  pw.println("<input type=submit><input type=reset>");
	  pw.println("</h></centre></body></html>");
	  
	}

}

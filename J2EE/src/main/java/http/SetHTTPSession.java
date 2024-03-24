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
 * Servlet implementation class SetHTTPSession
 */
public class SetHTTPSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String s1=request.getParameter("product1");
		String s2=request.getParameter("product2");
		String s3=request.getParameter("product3");
		String s4=request.getParameter("product4");
		
		  HttpSession hs=request.getSession(); 
		  hs.setAttribute("product1",s1);//name
		  hs.setAttribute("product2",s2);
		  hs.setAttribute("product3",s3);
		  hs.setAttribute("product4",s4); 
		  PrintWriter pw=response.getWriter();
		  pw.println("<html><body bgcolor=orange text=pink");
		  pw.println("<center><h1>you have added to cart <br>");
		  pw.println("To see  your selected items <a href=gethttpsession>click here");
		  pw.println("</h1></center></body></html>");
		 
		
	}

}

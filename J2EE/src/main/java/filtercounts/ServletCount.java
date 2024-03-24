package filtercounts;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/servletcount")
public class ServletCount extends HttpServlet
{
  public void doGet(HttpServletRequest request ,HttpServletResponse response)
  {
	  try {
		ServletContext sc=request.getServletContext();
		  int count=(Integer)sc.getAttribute("views");
		  PrintWriter pw=response.getWriter();
		  pw.println("<html><body bgcolor=orange><h1>");
		  pw.println("home page executed "+count+"-times");
		  pw.println("</h1></body></html>");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  		
  }
}

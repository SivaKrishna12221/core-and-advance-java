package basics;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class TableServlet
 */
public class TableServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public TableServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
	       PrintWriter pw=response.getWriter();
	       pw.println("<html><body bgcolor=orange text=black>");
	       pw.println("<table border=20>");
	       for(int i=1;i<=10;i++)
	       {
	    	   pw.println("<tr><td>5</td>");
	    	   pw.println("<td>*</td>");
	    	   pw.println("<td>"+i+"</td>");
	    	   pw.println("<td> = </td>");
	    	   pw.println("<td>"+5*i+"</td>");
	       }
	       pw.println("</tr></body></html");
	}

}

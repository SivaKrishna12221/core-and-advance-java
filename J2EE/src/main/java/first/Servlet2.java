 package first;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class Servlet2 extends GenericServlet
{
  public void service(ServletRequest req, ServletResponse res)
  {
	  try {
		PrintWriter pw=res.getWriter();
		  pw.println("welcome to nareshit ");
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
  }
}

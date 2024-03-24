package first;

import java.io.*;

import jakarta.servlet.*;


public class FirstServlet extends GenericServlet
{
	public void service(ServletRequest request, ServletResponse response) 
	{
		try
		{
		  PrintWriter pw=response.getWriter();
		  pw.println("welcome to Servlets");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}

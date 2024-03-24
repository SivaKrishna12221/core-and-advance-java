package basics;

import jakarta.servlet.GenericServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

import java.io.FileInputStream;
import java.io.*;


/**
 * Servlet implementation class ImageServlet
 */
public class ImageServlet extends GenericServlet
{
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		ServletOutputStream sos=response.getOutputStream();
		FileInputStream fis=new FileInputStream("\"C:\\Users\\SIVA VELPULA\\OneDrive\\Pictures\\download.jpg\"");
		int n=fis.available();
		byte [] b=new byte[n];
		fis.read(b);
		sos.write(b);
		
		
	}

}

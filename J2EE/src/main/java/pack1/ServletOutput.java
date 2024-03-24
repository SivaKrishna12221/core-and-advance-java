package pack1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/ServletOutput")
public class ServletOutput extends GenericServlet
{
 public void service(ServletRequest req,ServletResponse res)
 {
	 try {
		ServletOutputStream sos=res.getOutputStream();
		 FileInputStream fis=new FileInputStream("\"C:\\Users\\SIVA VELPULA\\OneDrive\\Pictures\\00.jpg\"");
		 int n=fis.available();
		 byte[]b=new byte[n];
		 fis.read(b);
		sos.write(b);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
 }
}

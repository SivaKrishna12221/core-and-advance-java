package hsl;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class HTTPListener
 *
 */
public class HTTPListener implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public HTTPListener() {
        // TODO Auto-generated constructor stub
    }
    int count=0;
    public void sessionCreated(HttpSessionEvent se)  { 
      count++;
      HttpSession hs=se.getSession();
      hs.setAttribute("users",count);
     
    	
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
         count--;
         HttpSession hs2=se.getSession();
         hs2.setAttribute("users",count);
    }
	
}

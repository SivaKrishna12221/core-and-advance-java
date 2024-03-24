package hsl;

import java.sql.Connection;
import java.sql.DriverManager;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class ListenerP
 *
 */
public class ListenerP implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ListenerP() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    Connection con;
    public void contextInitialized(ServletContextEvent sce)  { 
        try
        {
        	Class.forName("oracle.jdbc.driver.OracleDriver");
           con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","siva");
        	ServletContext sc=sce.getServletContext();//getservletcontext() of the servletcontextEvent is responsible for creating an object for the servletcontext
        	sc.setAttribute("oracle1",con);
        }catch(ClassNotFoundException cf)
        {
        	cf.printStackTrace();
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
        try {
        	con.close();
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
    }
	
}

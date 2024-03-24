package jdbcDemos;

import java.sql.*;

public class ConnectionDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stud
		 try{
			   Class.forName("oracle.jdbc.driver.OracleDriver");
			   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","siva");
			  System.out.println("Connection established successfully");
			  }
			  catch(Exception e)
			{
			 System.err.println(e);
			}
	}

}

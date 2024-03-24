package jdbcDemos;
import java.sql.*;


public class DemoA 
{
  public static void main(String[] args) 
  {
	  try {
	  Class.forName("oracle.jdbc.driver.OracleDriver");
	  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","siva");
	  Statement stmt=con.createStatement();
	  stmt.executeUpdate("delete from student where rollno=3");
	  System.out.println("delete row successfully");
	  }
	  catch(Exception e)
	  {
		  System.err.println(e);
	  }

}
}
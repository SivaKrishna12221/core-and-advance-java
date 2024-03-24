package jdbcDemos;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class InsertRowDemo 
{
	public static void main(String[] args) 
	{
		try {
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","siva");
		  Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		  ResultSet rs=stmt.executeQuery("select rollno,name,marks from student");
		  rs.moveToInsertRow();
		  rs.updateInt(1,5);
		  rs.updateString(2,"keerthi");
		  rs.updateInt(3,95);
		  rs.insertRow();
		  System.out.println("one record inserted successfully");
		}
		catch(ClassNotFoundException |SQLException e)
		{
			e.printStackTrace();
		}
	}

}

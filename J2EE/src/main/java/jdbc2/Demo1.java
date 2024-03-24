package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 
{
  public static void main(String[] args) {
	  
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","siva");
		Statement stmt=con.createStatement();
		/*
		 * stmt.execute("create,alter,drop"); stmt.executeUpdate("dml commands");
		 */
		ResultSet rs=stmt.executeQuery("select * from student1");
		ResultSetMetaData rm=rs.getMetaData();
		int n=rm.getColumnCount();
		while(rs.next())
		{//for getting columns 
			for(int i=1;i<=n;i++)
			{
				System.out.print(rs.getString(i)+"\t");
			}
			System.out.println();
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
	
}
}

package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoType 
{
 public static void main(String[] args) 
 {
	 try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","siva");
			Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=stmt.executeQuery("select rollno,name,marks from student");
			/*
			 * rs.absolute(5); System.out.print(rs.getInt("rollno"+"\t"));
			 * System.out.print(rs.getString("name"+"\t"));
			 * System.out.print(rs.getInt("marks")); System.out.println();
			 */
			/*
			 * rs.absolute(3); rs.updateInt(3,91); rs.updateRow();
			 * System.out.println("updated");
			 */
			rs.moveToInsertRow();
			rs.updateInt(1,11);
			rs.updateString(2,"raju");
			rs.updateInt(3, 78);
			rs.insertRow();
			System.out.println("inserted ");
			
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

package jdbc1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Type_scroll_sensitive 
{
  public static void main(String[] args) {
	  
	  try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:ORCL";
			String user="system";
			String password="siva";
			Connection con=DriverManager.getConnection(url,user,password);
			Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=stmt.executeQuery("select rollno,name,marks from student1");
			
			
			/*
			 * rs.absolute(2); System.out.println(rs.getInt("rollno"+"\t"));
			 * System.out.println(rs.getString("name"+"\t"));
			 * System.out.println(rs.getInt("marks"));
			 */
			/*
			 * rs.absolute(2); rs.updateInt(3,85); rs.updateRow();
			 */
			/*
			 * rs.absolute(1); rs.moveToInsertRow(); rs.updateInt(1,103);
			 * rs.updateString(2,"ravi"); rs.updateInt(3,97); rs.insertRow();
			 */
			rs.absolute(3);
			rs.deleteRow();
			
			System.out.println("deleted");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}

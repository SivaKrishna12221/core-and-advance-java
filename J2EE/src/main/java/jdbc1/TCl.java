package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class TCl 
{
 public static void main(String[] args) 
 {
	 try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","siva");
		 con.setAutoCommit(false);
		 Statement stmt=con.createStatement();
		 stmt.executeUpdate("update student1 set marks=100 where rollno=102");
		 Savepoint  s1=con.setSavepoint();
		 stmt.executeUpdate("delete from student1 where rollno=103");
		 con.rollback();
		 stmt.executeUpdate("insert into student1 values(104,'ravan',88)");
		 con.commit();
		 System.out.println("update successfully");
		 
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 
}
}

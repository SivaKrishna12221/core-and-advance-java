package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class TCl
{
 public static void main(String[] args) {
	 try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","siva");
		System.out.println(con.getAutoCommit());
		con.setAutoCommit(false);
		System.out.println(con.getAutoCommit());
		Statement stmt=con.createStatement();
		stmt.executeUpdate("Update student set marks=80 where rollno=12");
		Savepoint s1=con.setSavepoint();
		stmt.executeUpdate("delete from student where rollno=12");
		con.rollback(s1);
		con.commit();
		System.out.println("updated");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

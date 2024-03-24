package jdbc1;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BatchProcessing
{
 public static void main(String[] args) throws Exception {
	
		 try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","siva");
			   Statement stmt=(Statement) con.createStatement();
			   ((java.sql.Statement) stmt).addBatch("insert into student1 values(101,'ram',89)");
			   ((java.sql.Statement) stmt).addBatch("update student1 set marks=90 where rollno=102");
			   ((java.sql.Statement) stmt).addBatch("delete from student1 values where rollno=103");
			   stmt.execute();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       
	
}
}

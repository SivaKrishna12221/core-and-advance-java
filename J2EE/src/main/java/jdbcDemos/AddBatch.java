package jdbcDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddBatch 
{
 public static void main(String[] args) 
 { try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","siva");
	Statement stmt=con.createStatement();
	stmt.addBatch("insert into student values(9,'laksmi',78)");
	stmt.addBatch("update student set marks=80 where rollno=5");
	stmt.addBatch("delete from student where rollno=4");
	stmt.executeBatch();
	System.out.println("no.of dml operation done at a time");
 }catch(Exception e)
 {
	 System.out.println(e);
 }
}
}

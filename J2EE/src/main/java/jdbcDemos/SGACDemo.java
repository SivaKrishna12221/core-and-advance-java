package jdbcDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Savepoint;
import java.sql.Statement;

public class SGACDemo
{ 
	public static void main(String[] args) {
	try {
  Class.forName("oracle.jdbc.driver.OracleDriver");
  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","siva");
  con.getAutoCommit();//by default auto commit is true;
  System.out.println(con.getAutoCommit());
  con.setAutoCommit(false);
  System.out.println(con.getAutoCommit());
  Statement stmt=con.createStatement();
  stmt.executeUpdate("update student set marks=40 where rollno=1");
  Savepoint s=con.setSavepoint();
  stmt.executeUpdate("delete from student where rollno=7");
  con.rollback(s);
  stmt.executeUpdate("insert into student values(10,'sulam',88)");
  con.commit();
  System.out.println("dml operation done successfully");
 
}
	catch(Exception e)
 {
	e.printStackTrace();
 }
}
}
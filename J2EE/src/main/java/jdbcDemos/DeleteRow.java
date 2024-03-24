package jdbcDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRow
{
  public static void main(String[] args) {
  try {
  Class.forName("oracle.jdbc.driver.OracleDriver");
  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","siva");
  Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
  ResultSet rs=stmt.executeQuery("select rollno,name,marks from student");
  rs.absolute(-1);
  rs.deleteRow();
  System.out.println("successfully deleted row");
  }catch(ClassNotFoundException |SQLException e)
  {
	  e.printStackTrace();
  }
  }	  
}

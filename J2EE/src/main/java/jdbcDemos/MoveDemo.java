package jdbcDemos;

import java.sql.*;

public class MoveDemo 
{
  public static void main(String[] args) 
  {
	  try {
	  Class.forName("oracle.jdbc.driver.OracleDriver");
	  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","siva");
	  Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	  ResultSet rs=stmt.executeQuery("select rollno,name,marks from student");
	  ResultSetMetaData rm=rs.getMetaData();
	  int n=rm.getColumnCount();
	  for (int i=1;i<=n;i++)
	  {
		  System.out.print(i+"\t");
	  }
	  System.out.println();
	  rs.absolute(5);
	  System.out.print(rs.getInt("rollno")+"\t");
	  System.out.print(rs.getString("name")+"\t");
	  System.out.println(rs.getInt("marks"));
	  
	  
	  System.out.println("query executed successfully ");
	  }
	  catch(ClassNotFoundException | SQLException e)
	  
	  {
		  e.printStackTrace();
	  }
}
}

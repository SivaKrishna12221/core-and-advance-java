package jdbcDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Psdemo
{
  public static void main(String[] args)
  {
	  try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","siva");
	PreparedStatement pstmt=con.prepareStatement("insert into student values(?,?,?)");
	pstmt.setInt(1, Integer.parseInt(args[0]));
	pstmt.setString(2,args[1]);
	pstmt.setInt(3,Integer.parseInt(args[2]));
	pstmt.executeUpdate();
	System.out.println("one record inserted succesfully");
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
  }
}

package jdbcDemos;

import java.sql.*;
public class Csdemo 
{
  public static void main(String[] args) 
  {
	  try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","siva");
	CallableStatement cstmt=con.prepareCall("{call insertpro(?,?,?)}");
	cstmt.setInt(1,Integer.parseInt(args[0]));
	cstmt.setString(2,args[1]);
	cstmt.setInt(3,Integer.parseInt(args[2]));
	cstmt.executeUpdate();
	System.out.println("One record inserted successfully");
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
	
}
}

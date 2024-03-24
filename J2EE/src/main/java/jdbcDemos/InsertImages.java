package jdbcDemos;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertImages 
{
  public static void main(String[] args) 
  {
	  try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","siva");
	PreparedStatement pstmt=con.prepareStatement("insert into images values(?,?)");
	pstmt.setString(1,args[0]);
	FileInputStream fis=new FileInputStream(args[1]);
	pstmt.setBinaryStream(2,fis,fis.available());
	pstmt.executeUpdate();
	System.out.println("one Image Inserted successfully");
	  }catch(ClassNotFoundException | SQLException|IOException e)
	  {
		  e.printStackTrace();
	  }
}
}

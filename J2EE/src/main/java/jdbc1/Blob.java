package jdbc1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Blob//binary large amount data
//it is used to store  and retrive large amount of binary 
//data as a single entity in from database.
//blob supports all types of data (text,images,graphics,animation,audio,vide)
{
 public static void main(String[] args) {
	 
	 try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","siva");
		 PreparedStatement pstmt=con.prepareStatement("insert into images values(?,?)");
		 pstmt.setString(1,args[0]);
		 FileInputStream fis=new FileInputStream(args[1]);
		 pstmt.setBinaryStream(2,fis,fis.available());
		 pstmt.executeUpdate();
		 System.out.println("one image is inserted succesfully");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     
}
}

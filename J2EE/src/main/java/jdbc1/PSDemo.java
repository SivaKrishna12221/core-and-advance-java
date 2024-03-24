package jdbc1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PSDemo 
{
   public static void main(String[] args) {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:ORCL";
		String user="system";
		String password="siva";
		Connection con=DriverManager.getConnection(url,user,password);
		/*
		 * PreparedStatement
		 * pstmt=con.prepareStatement("insert into emp1 values(?,?,?,?)");
		 * pstmt.setInt(1, Integer.parseInt(args[0]));//by default string type is
		 * available .we need covert into integerf pstmt.setString(2, args[1]);
		 * pstmt.setString(3,args[2]); pstmt.setInt(4, Integer.parseInt(args[3]));
		 * pstmt.executeUpdate();
		 */
		CallableStatement cstmt=con.prepareCall("{call insertPro(?,?,?)}");
		cstmt.setInt(1,Integer.parseInt(args[0]));
		cstmt.setString(2,args[1]);
		cstmt.setInt(3,Integer.parseInt(args[2]));
		System.out.println("one record added successfully");
	} catch (NumberFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

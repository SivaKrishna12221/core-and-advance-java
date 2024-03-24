package jdbcDemos;

import java.sql.*;

public class DemoB 
{ 
	public static void main(String[] args) {
		
	try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","siva");
	Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery("select * from student");
	ResultSetMetaData rm= rs.getMetaData();
	int n=rm.getColumnCount();
	for(int i=1;i<=n;i++)
	{
		System.out.print((i)+"\t");
	}
	System.out.println();
	/*
	while(rs.next())
	{
		System.out.print(rs.getInt(1)+"\t");
		System.out.print(rs.getString(2)+"\t");
		System.out.print(rs.getInt(3)+"\t");
		System.out.println();
	}
	*/
	/*
	 
	while(rs.next())
	{
		System.out.print(rs.getInt("rollno")+"\t");
		System.out.print(rs.getString("name")+"\t");
		System.out.print(rs.getInt("marks"));
		System.out.println();
	}
	*/
	while(rs.next())
	{
		for (int i=1;i<=n;i++)
		{
			System.out.print(rs.getString(i)+"\t");//it search first column
		}
		System.out.println();
	}
	}
	catch(Exception e)
	{
		System.err.println(e);
	}
}
}
	

	
	

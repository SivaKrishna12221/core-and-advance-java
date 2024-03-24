package jdbcDemos;

import java.sql.*;

public class Demo 
{
	public static void main(String[] args) 
	{
		try {
       Class.forName("oracle.jdbc.driver.OracleDriver");
       Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","siva");
       Statement stmt=con.createStatement();
        //stmt.execute("create table student1(rollno number(3),name varchar2(10),marks number(3))");
       //stmt.execute("alter table student1 modify  rollno number(5)");
        //stmt.execute("alter table student1 drop column rollno");
       // stmt.execute("alter table student1 add column rollno number(3)");
     //  stmt.execute("alter table student1 add  rollno number(5)");
        //stmt.execute("drop table student1 purge");
      // stmt.execute("create table student1 (rollno number(3),name varchar2(10),marks number(3))");
      // stmt.executeUpdate("insert into student1 values(103,'lakshman',96)");
     ResultSet rs=stmt.executeQuery("select * from student1");
      ResultSetMetaData rm=rs.getMetaData();
      int num=rm.getColumnCount();
		/*
		 * while(rs.next()) { System.out.print(rs.getInt(1)+"\t");
		 * System.out.print(rs.getString(2)+"\t"); System.out.print(rs.getInt(3)+"\t");
		 * System.out.println(); }
		 */
       while(rs.next())
       {
    	   for(int i=1;i<=num;i++)
    	   {
    		   System.out.print(rs.getString(i)+"\t");
    		   
    	   }
    	   System.out.println();
       }
       System.out.println("connection established successfully");
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
       
	}
}


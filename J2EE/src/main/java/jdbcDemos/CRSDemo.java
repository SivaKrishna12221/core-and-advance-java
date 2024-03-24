package jdbcDemos;

import javax.sql.rowset.CachedRowSet;

import oracle.jdbc.rowset.OracleCachedRowSet;
import java.sql.*;

public class CRSDemo
{
  public static void main(String[] args) 
  {
	try {
	CachedRowSet crs=new OracleCachedRowSet();
	crs.setUrl("oracle:jdbc:thin:@localhost:1521:ORCL");
	crs.setUsername("system");
	crs.setPassword("siva");
	crs.setCommand("select * from student");
	crs.execute();
	while(crs.next())
	{
		System.out.println(crs.getInt("rollno")+"\t");
		System.out.println(crs.getString("name")+"\t");
		System.out.println(crs.getInt("marks")+"\t");
	}
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}

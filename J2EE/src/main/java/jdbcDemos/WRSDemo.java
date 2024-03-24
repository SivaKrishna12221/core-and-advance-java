package jdbcDemos;

import java.io.FileOutputStream;

import javax.sql.rowset.WebRowSet;

import oracle.jdbc.rowset.OracleWebRowSet;

public class WRSDemo
{
	public static void main(String[] args) 
	{
	

	try
{
  WebRowSet wrs=new OracleWebRowSet();
  wrs.setUrl("jdbc:oracle:thin:@localhost:1521:ORCL");
  wrs.setUsername("system");
  wrs.setPassword("siva");
  wrs.setCommand("select * from student");
  wrs.execute();
  FileOutputStream fos=new FileOutputStream("student.xml");
  wrs.writeXml(fos);
  System.out.println("send data successfully");
  
}
	catch(Exception e)
{
	e.printStackTrace();
}
}
 
}

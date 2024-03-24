package jdbc2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;

import javax.sql.rowset.WebRowSet;

import oracle.jdbc.rowset.OracleWebRowSet;

public class wrs
{
 public static void main(String[] args) {
	try {
		WebRowSet wrs=new OracleWebRowSet();
		wrs.setUrl("jdbc:oracle:thin:@localhost:1521:ORCl");
		wrs.setUsername("system");
		wrs.setPassword("siva");
		wrs.setCommand("select * from student");
		wrs.execute();
		FileOutputStream fos=new FileOutputStream("student2.xml");
		wrs.writeXml(fos);
		System.out.println("imported to xml file");
	} catch (SQLException |IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}

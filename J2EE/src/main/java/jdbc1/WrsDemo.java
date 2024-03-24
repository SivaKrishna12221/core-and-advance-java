package jdbc1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;

import javax.sql.rowset.WebRowSet;

import oracle.jdbc.rowset.OracleWebRowSet;

public class WrsDemo
{/*
* web row set same as cached row set additionally it allows
* to write web row set data to xml file,
* Xml stands for extensible marksup language
* generated xml file can be used in internet application
*/
   public static void main(String[] args) {
	try {
		WebRowSet wrs=new OracleWebRowSet();
		wrs.setUrl("jdbc:oracle:thin:@localhost:1521:ORCL");
		wrs.setUsername("system");
		wrs.setPassword("siva");
		wrs.setCommand("select * from student1");;
		wrs.execute();
		FileOutputStream fos=new FileOutputStream("student1.xml");
		wrs.writeXml(fos);
		System.out.println("write webrowset data to xml file successfully");
		
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

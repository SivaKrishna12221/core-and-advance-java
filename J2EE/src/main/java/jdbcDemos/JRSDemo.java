package jdbcDemos;
import java.sql.*;

import javax.sql.rowset.JdbcRowSet;
import oracle.jdbc.rowset.OracleJDBCRowSet;

public class JRSDemo 
{
   public static void main(String[] args) 
   {
	   try {
	JdbcRowSet jrs=new OracleJDBCRowSet();
    jrs.setUrl("jdbc:oracle:thin:@localhost:1521:ORCL");
    jrs.setUsername("system");
    jrs.setPassword("siva");
    jrs.setCommand("select * from student");
    jrs.execute();
    while(jrs.next())
    {
    	System.out.print(jrs.getInt("rollno")+"\t");
    	System.out.print(jrs.getString("name")+"\t");
    	System.out.print(jrs.getInt("marks")+"\t");
    	System.out.println();
    }
	   }catch(Exception e)
	   {
		   e.printStackTrace();
	   }
}
}

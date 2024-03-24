package jdbc1;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;

import oracle.jdbc.rowset.OracleJDBCRowSet;

public class JRSDemo 
{
   public static void main(String[] args) {
	
   try {
	JdbcRowSet jrs=new OracleJDBCRowSet(); //jdbcrowset ;;object is connected to the database .  
	   jrs.setUrl("jdbc:oracle:thin:@localhost:1521:ORCL");
	   jrs.setUsername("system");
	   jrs.setPassword("siva");
	   jrs.setCommand("select * from student1");
	   jrs.execute();
	   while(jrs.next())
	   {
	   System.out.println(jrs.getInt("rollno"+"\t"));
	   System.out.println(jrs.getString("name"+"\t"));
	   System.out.println(jrs.getInt("marks"+"\t"));
	   }
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   
   
}
}

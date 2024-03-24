package jdbc2;

import java.sql.SQLException;

import javax.sql.rowset.CachedRowSet;

import oracle.jdbc.rowset.OracleCachedRowSet;

public class crs
{//It is serializable object,jdbc is connected object 
	//and remaining are disconnected object
	//all rowsets are java beans
	//In order to get rowset we need to implementation class only
	public static void main(String[] args) 
	{
		try {
			CachedRowSet crs=new OracleCachedRowSet();
			crs.setUrl("jdbc:oracle:thin:@localhost:1521:ORCl");
			crs.setUsername("system");
			crs.setPassword("siva");
			crs.setCommand("select * from student");
			crs.execute();
			while(crs.next())
			{
			System.out.print(crs.getInt("Rollno")+"\t");
			System.out.print(crs.getString("name")+"\t");
			System.out.println(crs.getInt("marks")+"\t");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

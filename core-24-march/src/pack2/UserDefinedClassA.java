package pack2;

public class UserDefinedClassA 
{
	int Stid;
	String Sname;
	String Scourse;//user defined objects
	public UserDefinedClassA(int stid, String sname, String scourse)
	{
		
		this.Stid = stid;
		this.Sname = sname;
		this.Scourse = scourse;
	}
	@Override
	public String toString()
	{
		return  Stid +" "+ Sname + " "+ Scourse ;
	}
	
	
	

}

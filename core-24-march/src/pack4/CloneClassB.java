package pack4;

public class CloneClassB implements Cloneable
{
	int x=100;
	int y=200;
	
	 CloneClassB show()throws CloneNotSupportedException
	{
	CloneClassB	bobj=(CloneClassB)super.clone();//here we are creating a clone method with class object 
	return bobj;
	}
	

}

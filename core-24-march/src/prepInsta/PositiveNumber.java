package prepInsta;

public class PositiveNumber 
{ 
	void meth1(int num)
	{
	  if(num>0)
	  {
		  System.out.println("positive number");
	  }
	  else if(num<0)
	  {
		  System.out.println("negative number");
	  }
	  else
	  {
		  System.out.println("zero");
	  }
	}
	public static void main(String[] args) 
	{
		PositiveNumber aobj=new PositiveNumber();
		aobj.meth1(0);
	}
}

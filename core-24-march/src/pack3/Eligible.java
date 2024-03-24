package pack3;

public class Eligible
{
	void meth1(int a)
	{
	  if(a>=18)
	  {
		  System.out.println("person is Eligible for vote");
	  }
	  else
	  {
		  System.out.println("Person is not Eligible for vote");
	  }
	}
	public static void main(String[] args) 
	{
		new Eligible().meth1(30);
		
	}

}

package pack3;

public class Biggest3 
{
	void meth1(int a,int b,int c)
	{
		if(a>b)
		{
			if(a>c)
			System.out.println(a+"is biggest");
			else
		    System.out.println(c+"is biggest");
			
		}
		else
		{
			if(b>c)
				System.out.println(b+"is biggest");
			else
				System.out.println(c+"is biggest");
		}
	
	}
	public static void main(String[] args) 
	{
		Biggest3 aobj=new Biggest3();
        aobj.meth1(1000,500,100);
		
		
	}
}
package pack3;

public class ThisKeyword 
{
	int a=10;
	static int b=20;
	
	void meth1()
	{
		int a=100;
		int b=200;
		
		System.out.println("Instance variable:"+this.a);
		System.out.println("Static variable:"+ThisKeyword.b);
		System.out.println("static variable:"+this.b);
		
	}
	public static void main(String[] args)
	{
		new ThisKeyword().meth1();
		
	}

}

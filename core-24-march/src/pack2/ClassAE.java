package pack2;

public class ClassAE 
{
	static int x=10;//static variables 
	static int y=20;
	static 
	{
		System.out.println("--Test11 SBI called--");
		System.out.println("x:"+x);
		System.out.println("y:"+y);
	}
	static void m1()
	{
		int x=100;
		System.out.println("static method called");		
		System.out.println("x:"+x);
		System.out.println("y:"+y);
	
	}
	public static void main(String[] args) 
	{
		m1();
	}
			static
			{
				System.out.println("---Test1 SB2 called--");
				System.out.println("x:"+x);
				System.out.println("y:"+y);
			}
		
		
	

}

package pack2;

public class ClassAF
{
	static int x=m1();
	public static void main(String[] args)
	{
		System.out.println(ClassAF.x);
		
	}
	static
	{
		System.out.println(x);
		ClassAF.x=x+20;
	}
	static int m1()
	{
		ClassAF.x=50;
		return m2();
	}
	static int m2()
	{
		System.out.println(ClassAF.x);
		return 100;
	}

}

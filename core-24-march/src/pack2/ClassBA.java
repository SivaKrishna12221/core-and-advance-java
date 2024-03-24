package pack2;

public class ClassBA
{
	private void meth1()
	{
		System.out.println("I am from Outer class ");
		
	}
	class innerClassA
	{
		void show()
		{
			System.out.println("I am from inner class");
			 new ClassBA().meth1();
			
		}
		innerClassA()
		{
			System.out.println("Inner Class constructor");
		}
		
	}
	ClassBA()
	{
		System.out.println("Outer Class Constructor");
	}
	static
	{
		System.out.println("OuterClass static block executed");
	}
	public static void main(String[] args)
	{
	ClassBA.innerClassA	icobj=new ClassBA().new innerClassA();
	icobj.show();
	
	}

}

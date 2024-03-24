package pack2;

public class ClassBL_E 
{
	void meth1(int age)
	{
		if (age>18)
		{
			System.out.println("person is elgible for vote");
		}
		else
		{
			System.out.println("Person is not eligible for vote");
		}
	}
	static void meth2(int y)
	{
		System.out.println("Static method referring");
	}
	ClassBL_E(int y)
	{
		System.out.println("constructor referring");
	}
	

}

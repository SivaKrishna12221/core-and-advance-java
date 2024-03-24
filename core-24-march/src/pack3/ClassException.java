package pack3;

public class ClassException 
{
	void meth1()
	{
		System.out.println(10);
		/* 
		 * We can handle exception by using try-catch-finally blocks.
		 */
		try
		{
			/*
			 * Inside try block we need to write suspecious code.
			 */
			System.out.println(10293+3530-5032858);	
		}
		catch(ArithmeticException e)
		{
			/*
			 * inside try block we need to catch the exception which occured in try
			 * block..
			 */
			System.out.println("Catch block executed");
		}
		finally
		{
			System.out.println("finally block executed");
		}
		
		System.out.println("==>"+30);
	}
	public static void main(String[] args)
	{
		new ClassException().meth1();
	}

}

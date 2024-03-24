package pack4;
import java.util.Scanner;

public class ClassExceptionA 
{
	void meth1()
	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(10);
		try
		{
		System.out.println("Try block  executed");
		System.out.println("please give a cotient value:");
		System.out.println(20/sc.nextInt());
		/*
		 * we can handle an exception by using try-catch-finally blocks
		 * Whenever we are using this three blocks we should 100% maintain an order.
		 * Inside a try block we need to write minimum code..suspicious
		 */
		System.out.println("40");//it doesn't execute
		}
		/*
		 * if there is an exception in the try block then immediately the compiler will
		 * be coming to its respective catch block .Remaining code which is present in
		 * catch block will not be executed.
		 */
		catch(ArithmeticException A)
		{
			System.out.println("catch block executed");
			System.out.println("toString():"+A.toString());
		    //It gives  name & reason of the exception
			System.out.println("getMessage():"+A.getMessage());
			//Gives the reason of the exception.
			
		}
		finally
		{
			System.out.println("finally block executed");
		}
		try
		{
			System.out.println(39/0);
		}
		/*
		 * A Catch block will be executed only if there is an exception occur
		 *  in the try block and we are catching that respective exception..
		 * 
		 */
		catch(ArithmeticException A)
		{
			System.out.println("CatchB block executed");
			System.out.println("toString:"+A.toString());
			//it gives  the name & reason of the exception
			System.out.println("GetMessage:"+A.getMessage());
		}
		try
		{
			System.out.println(55/0);
		}
		catch(Exception A)
		{
			System.out.println("If we are catching the parent exception classes (i.e exception)"
					+ " then every exception will be handled");
		}
		System.out.println(30);
		//try
		{
			System.out.println("A single try block never be executed");
		}
		try
		{
			System.out.println("A try block should be follow either catch or finnally or both");
		}
		finally
		{
			System.out.println("without catch block we can execute try block");
		}
		try
		{
			System.out.println(33/0);
		}
		catch(Exception a)
		{
			System.out.println("toString:"+a.toString());
		}
		finally
		{
			System.out.println("If we are not  writing catch block in our program"
					+ "there will not be having any error.But if there is an exception occured "
					+ "in the our program it will not be handled");
		}
	}
	public static void main(String[] args)
	{ 
	  new ClassExceptionA().meth1();
		
	}

}

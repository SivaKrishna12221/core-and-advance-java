package pack2;
import java.io.FileReader;

public class ClassExceptionC 
{
	void meth1()
	{
		System.out.println(10);
		String s=null;
		try 
		{
			System.out.println("try block executed");
			System.out.println("length():"+s.length());

			System.out.println(20/0);
						
		}
		catch(NullPointerException |ArithmeticException e)
		{
			System.out.println("catch block executed");
			e.printStackTrace();
			
		}
		
		/*catch(NullPointerException n)
		{
			System.out.println("1st catch block executed");
			System.out.println("toString():"+s.toString());
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch block executed");
			System.out.println("toString():"+e.toString());
			System.out.println("Getmessage():"+e.getMessage());
		   
		}
		*/
		//we can handle multiple exceptions by using multiple catch blocks
		/*
		 * for a single try block we can write multiple catch blocks that but we 
		 * need to write only one final block.
		 * multiple catch blocks are allowed but multiple final blocks are not allowed
		 * whenever we are using multiple catch blocks always parent exception
		 * should be the handled in the last catch block..
		 * If we are using multiple catch blocks duplicates exceptions are not allowed
		 * we will be getting a compile time error..
		 */
		finally
		{
			System.out.println("Finally block executed");
			
		}
		System.out.println(30);
	}
	void meth2()throws Exception
	{
		try {FileReader fr=new FileReader("filePath")};
	}
	public static void main(String[] args)
	{
		
		new ClassExceptionC().meth1();
		new ClassExceptionC().meth2();
	}

}

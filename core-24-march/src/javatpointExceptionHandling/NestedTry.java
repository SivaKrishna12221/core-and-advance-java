package javatpointExceptionHandling;

public class NestedTry 
{
 public static void main(String[] args) {
	try {
		try {
		  int a=20/0;
		  System.out.println("try block executed");
		}catch(ArithmeticException ae)
		{
			ae.printStackTrace();
			System.out.println("arithemetic exception ");
		}
		try {
			int arr[]=new int[5];
			arr[5]=10;
		}
		catch(ArrayIndexOutOfBoundsException are)
		{
		are.printStackTrace();
		System.out.println("array out of bounds exception ");
		}
	}
	catch(Exception e)
	{
		System.out.println("exception e");
        e.printStackTrace();
	}
    finally
    {
    	System.out.println("finally block exceuted");
    }
	System.out.println("nested try block");
	try
	{
		try {
			int arr[]=new int[5];
			arr[5]=10/0;
			
		}
		catch(ArithmeticException are)
		{
			are.printStackTrace();
			System.out.println("arithmetic");
		}
	}
	catch(ArrayIndexOutOfBoundsException ae)
	{
		ae.printStackTrace();
		System.out.println("aioobe");
	}
	System.out.println("siva");
}
}

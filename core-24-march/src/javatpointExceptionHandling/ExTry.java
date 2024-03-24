package javatpointExceptionHandling;

public class ExTry
{
 public static void main(String[] args) {
	 
	try {
		int a=50/0;
		System.out.println("try block executed without exception");
	}
	catch(ArithmeticException ae)
	{
	    ae.printStackTrace();
		System.out.println("catch block executed");
	}
	
}
}

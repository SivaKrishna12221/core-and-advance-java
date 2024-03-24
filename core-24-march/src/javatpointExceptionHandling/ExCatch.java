package javatpointExceptionHandling;

public class ExCatch 
{
  public static void main(String[] args) {
	  try {
	int arr[]=new int[5];
	arr[5]=30/20;
	System.out.println("try block executed");
	  }
	  catch(ArrayIndexOutOfBoundsException are)
	  {
		  System.out.println("catch block Executed");
		  are.printStackTrace();
	  }
	  catch(ArithmeticException ae)
	  {
		  ae.printStackTrace();
		  System.out.println("arithmetic exception raised");
	  }
	  System.out.println("siva");
}
}

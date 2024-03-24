package javatpointExceptionHandling;

import java.io.IOException;

public class ExceRule2child extends ExcepRule2parent
{
	/*
	 * void msg()throws Exception { System.out.
	 * println("child class should not parent exception .if parent declare child execption"
	 * ); }
	 */
	void msg()throws IOException
	{
		System.out.println("if parent class method declare exception the child class should declare same or child exception not parent exception");
		
	}
  public static void main(String[] args) {
	ExcepRule2parent exce=new ExceRule2child();
	try {
		exce.msg();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

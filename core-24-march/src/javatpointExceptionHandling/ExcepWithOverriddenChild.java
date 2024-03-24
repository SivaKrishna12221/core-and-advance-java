package javatpointExceptionHandling;

import java.io.IOException;

public class ExcepWithOverriddenChild extends ExcepWithOverrideenParent 
{
	/*
	 * public void msg()throws IOException//we should not declare checked exception
	 * subclass overidden method. { System.out.println("child class"); }
	 */
	public void msg()throws ArithmeticException //it will declare unchecked and inform the programer about the exception information
	{
		System.out.println("we can declare unchecked exception in child class overridden method");
				try {
					int a=10/0;
				} catch (Exception e) {//If we are handling excepttion here we can continue our programm without terminating
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("after try block");
			
	}
   public static void main(String[] args) {
	   ExcepWithOverrideenParent exce=new ExcepWithOverriddenChild();//here we are creating an object for child with parent ref
	   exce.msg();
}
}

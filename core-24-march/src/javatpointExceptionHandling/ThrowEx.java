package javatpointExceptionHandling;

public class ThrowEx 
{
  public static void validate(int age)
  {
	  if(age<18)
	  {
		  
		  throw new ArithmeticException("person is not elible to vote");
		  
	  }
	  else
	  {
		  System.out.println("your eligible for voter");
	  }
  }
  public static void main(String[] args) {
	validate(10);
     System.out.println("rest of the code");
}
}

package javatpointExceptionHandling;

public class CustomExceptionEx extends Exception
{
  public static void valid(int age)throws CustomException
  {
	  if(age<18)
	  {
		  throw new CustomException("your age is below 18 so your  not eligible to vote");
	  }
	  else
	  {
		  System.out.println("your eligible");
	  }
  }
  public static void main(String[] args) {
	
	  try {
		valid(10);
	} catch (CustomException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}/* custom exception
	 * javatpointExceptionHandling.CustomException: your age is below 18 so your not
	 * eligible to vote at
	 * javatpointExceptionHandling.CustomExceptionEx.valid(CustomExceptionEx.java:9)
	 * at
	 * javatpointExceptionHandling.CustomExceptionEx.main(CustomExceptionEx.java:19)
	 * 
	 */
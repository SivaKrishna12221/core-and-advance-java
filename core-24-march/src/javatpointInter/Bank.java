package javatpointInter;

public interface Bank 
{
  void rateOfIntrest();
  default void meth1() {
	  System.out.println("default methods");
  }
  
}

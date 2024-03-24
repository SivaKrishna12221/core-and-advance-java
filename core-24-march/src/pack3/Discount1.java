package pack3;

public class Discount1 
{
  void meth1(int units)
  {
	  int finalBill=(units*100);
	  
	  if (finalBill>=1000)
	  {
		  int discount=(finalBill*10/100);
		  System.out.println("finalBill="+(finalBill-discount));
		  System.err.println("congrats you received "+discount+" as discount");
	  }
	  else
	  {
		  System.out.println("your finalBill is:"+finalBill);
	  }
  }
  public static void main(String[] args) 
  {
	new Discount1().meth1(50);
	
}
}

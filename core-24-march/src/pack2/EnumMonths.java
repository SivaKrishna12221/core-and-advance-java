package pack2;

import java.util.Arrays;

public class EnumMonths 
{
  void meth1()
  {
	  System.out.println("implementing enum months");
	  months m=months.may;
	  System.out.println("This is "+m);
	  System.out.println("implementing enum in switch case");
	  switch (m)
	  {
	  case april:
		  System.out.println("this is april");
		  break;
	  case may:
		  System.out.println("this is may");
		  break;
	  case june:
		  System.out.println("this is june");
		  default:
			  System.out.println("invalid data");
	  }
	  months arr[]=months.values();
	  System.out.println(Arrays.toString(arr));
	  for(months data:arr)
		  System.out.println(data);
  }
  public static void main(String[] args) 
  {
	new EnumMonths().meth1();
}
 
}

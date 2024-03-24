package pack1;

public class Discount
{
   void bill(int units)
   {
	   System.out.println("Thank you for purchasing the products");
	   int finalBill=units*100;
	   if (finalBill>=1000)
	   {
		  int discount=finalBill*10/100;
		  System.out.println("actual amount:"+finalBill);
		  System.out.println("FinalBill:"+(finalBill-discount));
		  System.out.println("congrats you received "+discount+" as discount");
		 
	   }
	   else
	   {
		   System.out.println("your bill is:"+finalBill);
	   }
	   System.out.println("thank you please come to my store every day");
   }
   public static void main(String[] args)
   {
	System.out.println("welcome to SivaChandana store");
	Discount aobj=new Discount();
	aobj.bill(25);
}
}

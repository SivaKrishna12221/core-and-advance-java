package pack2;

import java.util.Arrays;

public class EnumClass 
{
 void meth1()
 {
	 System.out.println("using Enum");
	 days1 d=days1.monday;
	 System.out.println("Today is "+d);
	 System.out.println("Implementing enum in Switch case");
	 switch(d)
	 {
	 case sunday:
		 System.out.println("Today is Sunday");
		 break;
	 case monday:
		 System.out.println("Today is Monday");
		 break;
	 case Tuesday:
		 System.out.println("Today is Tuesday");
		 break;
	 case wednesday:
		 System.out.println("Today is wednesday");
		 break;
	 case thursday:
		 System.out.println("Today is thursday");
		 break;
	 default:
		 System.out.println("invalid data");
	 
	 }
	 System.out.println("---------------");
	 days1 arr[]=days1.values();
	 System.out.println(Arrays.toString(arr));
	 for(days1 data:arr)
	 {
		 System.out.println(data);
	 }
	 
 }
 public static void main(String[] args) 
 {
	 new EnumClass().meth1();
	
}
}

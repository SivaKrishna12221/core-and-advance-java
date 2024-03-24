package pack2;

import java.util.Arrays;
import java.util.Scanner;

public class Book_your_tickets
{
  void tickets()
  {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Which movie do you want to watch?");
	 String Moviename=sc.next();
	 System.out.println("How many tickets you need?");
	 int No_of_Tickets=sc.nextInt();
	 String names[]=new String[No_of_Tickets];//here we are creating string array to return names.
	 System.out.println("please enter "+No_of_Tickets+"names");
	 for (int i=0;i<=names.length-1;i++)
	 {
		 names[i]=sc.next();
	 }
	 System.out.println("You have booked "+Moviename+"movie to "+Arrays.toString(names));
	 
	 
	 
  }
  public static void main(String[] args) 
  {
	      Book_your_tickets aobj=new Book_your_tickets();
	      aobj.tickets();
}
}

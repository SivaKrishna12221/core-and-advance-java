package prepInstaPatternPrinting;

import java.util.Scanner;

public class RhombusStarPattern 
{
  public static void main(String[] args) 
  {  
	  /*
	   * we need to take two values rows and column
	   * write a for loop and fix it upto row
	   * write another two for loops inside a for loop
	   * one is for space purpose and another one is for print * s
	   */
	 Scanner sc=new Scanner(System.in) ;
	 System.out.println("please enter row and column");
	 int r=sc.nextInt();
	 int c=sc.nextInt();
	 for(int i=1;i<=r;i++)
	 {
		 for(int j=1;j<=i;j++)
		 {
			 System.out.print(" ");
		 }
		 for(int j=1;j<=c;j++)
		 {
			 System.out.print("*");
		 }
		 System.out.println("");
	 }
}
}

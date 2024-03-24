package prepInsta;

import java.util.Scanner;

public class Practice 

{
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("please enter number");
	  int num=sc.nextInt();
	  int a=0;
	  int b=1;
	  System.out.print(a+","+b);
	  for(int i=2;i<=num;i++)
	  {
		  int c=a+b;
		  a=b;
		  b=c;
		  System.out.print(","+c);
	  }
	  
  }   
}
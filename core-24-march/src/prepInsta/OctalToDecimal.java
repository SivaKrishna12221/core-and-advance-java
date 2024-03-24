package prepInsta;

import java.util.Scanner;

public class OctalToDecimal//(512)8===>(330)2
{
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("please enter octal value");
	  int octal=sc.nextInt();
	  int decimal=0;
	  int temp;
	  int n=0;
	  while(octal!=0)
	  {
		  temp=octal%10;
		  decimal+=temp*Math.pow(8,n);
		  octal/=10;
		  n++;
	  }
	 
	  System.out.println("the decimal value of the octal number is:"+decimal);
	  sc.close();
}
}

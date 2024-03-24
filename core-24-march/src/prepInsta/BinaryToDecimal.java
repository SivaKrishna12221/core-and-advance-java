package prepInsta;

import java.util.Scanner;

public class BinaryToDecimal
{
	void meth1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter binary number:");
		int binary=sc.nextInt();
		int decimal=0;
		int temp;
		int n=0;
		while(binary!=0)
		{
			temp=binary%10;
			decimal+=temp*Math.pow(2,n);
			binary/=10;
			n++;
			
		}
		System.out.println("decimal form of "+binary+" is "+decimal);
		
		
	}
  public static void main(String[] args) 
  {
	 BinaryToDecimal btd= new BinaryToDecimal();
	 btd.meth1();
}
}

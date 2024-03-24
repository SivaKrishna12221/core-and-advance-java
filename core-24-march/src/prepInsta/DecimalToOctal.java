package prepInsta;

import java.util.Scanner;

public class DecimalToOctal
{
	Scanner sc=new Scanner(System.in);
	void meth1()
	{
		System.out.println("please enter decimal values:");
		int decimal=sc.nextInt();
		int octal[]=new int[20];
		int i=0;
		while(decimal>0)
		{
			int r=decimal%8;
			octal[i++]=r;
			decimal/=8;
		}
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(octal[j]);
		}
	}
	public static void main(String[] args)
	{
		new DecimalToOctal().meth1();
	}
}
package prepInsta;

import java.util.Scanner;

public class DecimalToBinary 
{
   public static void main(String[] args) 
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter a number:");
	int decimal=sc.nextInt();
	
	int arr[]=new int[20];
	int i=0;
	while(decimal>0)
	{
		int r=decimal%2;
		arr[i++]=r;
		decimal/=2;
		
		
	}
	System.out.println("binary number:");
	for(int j=i;j>0;j--)
	{
	
		System.out.print(arr[j]+" ");
	}
}
}

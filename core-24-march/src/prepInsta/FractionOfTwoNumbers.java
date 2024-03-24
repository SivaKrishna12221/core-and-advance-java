package prepInsta;

import java.util.Scanner;

public class FractionOfTwoNumbers
//cross multiplication , hcf methods
{
 public static void main(String[] args) 
 {
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter numerator in first number:");
	int n1=sc.nextInt();
	System.out.println("enter denominator in first number:");
	int d1=sc.nextInt();
	System.out.println("enter numerator in second number:");
	int n2=sc.nextInt();
	System.out.println("enter denominator in second number:");
	int d2=sc.nextInt();
	int x=(n1*d2)+(n2*d1);//numerator 
	int y=(d1*d2);//denominator
	//Trickpart.reduce it to the simplest form of by using hcf;
	int hcf=0;
	for(int i=1;i<=x&&i<=y;i++)
	{
		if(x%i==0&&y%i==0)
		  hcf=i;
	}
	System.out.println("\n The added fraction is "+x/hcf+"/"+y/hcf);
}
}
